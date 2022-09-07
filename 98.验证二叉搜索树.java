import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @Date: 2022-09-06 18:12:01
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-06 19:29:27
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
class Solution {
    /**
     * @description: 递归法
     * @param {TreeNode} root
     * @return {*}
     */
    // long maxVal = Long.MIN_VALUE;
    // public boolean isValidBST(TreeNode root) {
    // if (root == null) {
    // return true;
    // }
    // boolean left = isValidBST(root.left);
    // if (maxVal < root.val) {
    // maxVal = root.val;
    // } else {
    // return false;
    // }
    // boolean right = isValidBST(root.right);
    // return left && right;
    // }
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null; // 记录前一个节点
        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            TreeNode pop = stack.pop();
            if (pre != null && pop.val <= pre.val) {
                return false;
            }
            pre = pop;
            root = pop.right;
        }
        return true;
    }
}
// @lc code=end
