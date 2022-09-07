/*
 * @Date: 2022-09-07 14:21:56
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-07 20:14:50
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q || root == null) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right != null) {
            return right;
        } else if (left != null && right == null) {
            return left;
        } else if (left != null && right != null) {
            return root;
        } else {
            return null;
        }
    }
}
// @lc code=end
