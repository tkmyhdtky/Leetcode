import java.util.LinkedList;
import java.util.Stack;

/*
 * @Date: 2022-09-07 13:08:19
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-07 13:29:15
 * @Description: 方法一：中序遍历二叉搜索树，得到一个顺序链表，遍历最小值即可
 *               方法二：在中序遍历二叉搜索树的过程中计算最小值
 */
/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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
 * @description: 递归法
 * @return {*}
 */
// class Solution {
//     int result = Integer.MAX_VALUE;
//     TreeNode pre;

//     public int getMinimumDifference(TreeNode root) {
//         traversal(root);
//         return result;
//     }

//     public void traversal(TreeNode cur) {
//         if (cur == null)
//             return;
//         traversal(cur.left);
//         if (pre != null) {
//             result = Integer.min(result, cur.val - pre.val);
//         }
//         pre = cur;
//         traversal(cur.right);
//     }
// }
/**
 * @description: 迭代法
 * @return {*}
 */
class Solution {
    TreeNode pre;

    public int getMinimumDifference(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        int result = Integer.MAX_VALUE;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (pre != null) {
                    result = Integer.min(result, cur.val - pre.val);
                }
                pre = cur;
                cur = cur.right;
            }
        }
        return result;
    }

}
// @lc code=end
