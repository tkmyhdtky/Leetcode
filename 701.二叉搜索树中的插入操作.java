/*
 * @Date: 2022-09-07 20:40:26
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-07 21:09:45
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=701 lang=java
 *
 * [701] 二叉搜索树中的插入操作
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
     * @description: 迭代
     * @param {TreeNode} root
     * @param {int}      val
     * @return {*}
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode newRoot = root;
        TreeNode pre = root;
        while (root != null) {
            pre = root;
            if (root.val > val) {
                root = root.left;
            } else if (root.val < val) {
                root = root.right;
            }
        }
        TreeNode node = new TreeNode(val);
        if (node.val > pre.val) {
            pre.right = node;
        } else {
            pre.left = node;
        }
        return newRoot;
    }
}
// @lc code=end
