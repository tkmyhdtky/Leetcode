/*
 * @Date: 2022-08-05 14:17:10
 * @LastEditTime: 2022-08-05 14:31:29
 * @FilePath: \LeetCode\222.完全二叉树的节点个数.java
 */
/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
     * @description: 递归
     * @param {TreeNode} root
     * @return {*}
     */
    // public int countNodes(TreeNode root) {
    // if (root == null) {
    // return 0;
    // }
    // return countNodes(root.left) + countNodes(root.right) + 1;
    // }
    /**
     * @description: 针对完全二叉树的解法
     * @param {TreeNode} root
     * @return {*}
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);
        if (leftDepth == rightDepth) {
            return (1 << leftDepth) + countNodes(root.right);
        }else{
            return (1 << rightDepth) + countNodes(root.left);
        }
    }

    private int getDepth(TreeNode root) {
        int depth = 0;
        while (root != null) {
            root = root.left;
            depth++;
        }
        return depth;
    }
}
// @lc code=end
