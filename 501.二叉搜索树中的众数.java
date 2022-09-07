import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @Date: 2022-09-07 13:39:20
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-07 14:20:46
 * @Description: Defaultif
 */
/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
/**
 * @description: 递归法：从头遍历，邻两个元素作比较，把出现频率最高的元素输出
 * @return {*}
 */
// class Solution {
// ArrayList<Integer> resList;
// int maxCount;
// int count;
// TreeNode pre;

// public int[] findMode(TreeNode root) {
// resList = new ArrayList<>();
// maxCount = 0;
// count = 0;
// pre = null;
// find(root);
// int[] res = new int[resList.size()];
// for (int i = 0; i < resList.size(); i++) {
// res[i] = resList.get(i);
// }
// return res;
// }

// private void find(TreeNode root) {
// if (root == null) {
// return;
// }
// find(root.left);
// int rootValue = root.val;
// if (pre == null || rootValue != pre.val) {
// count = 1;
// } else {
// count++;
// }
// if (count > maxCount) {
// // 频率count 大于 maxCount的时候，不仅要更新maxCount，而且要清空结果集
// resList.clear();
// resList.add(rootValue);
// maxCount = count;
// } else if (count == maxCount) {
// // 如果和最大值相同，放进result中
// resList.add(rootValue);
// }
// pre = root;
// find(root.right);
// }
// }
/**
 * @description: 迭代法：思路与递归相同
 * @return {*}
 */
class Solution {
    TreeNode pre;

    public int[] findMode(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode cur = root;
        int maxCount = 0;
        int count = 0;
        int[] res;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (pre == null || pre.val != cur.val) {
                    count = 1;
                } else {
                    count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    result.clear();
                    result.add(cur.val);
                } else if (count == maxCount) {
                    result.add(cur.val);
                }
                pre = cur;
                cur = cur.right;
            }

        }
        res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
// @lc code=end
