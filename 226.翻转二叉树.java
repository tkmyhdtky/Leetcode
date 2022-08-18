import java.util.Stack;

/*
 * @Date: 2022-08-04 17:45:37
 * @LastEditTime: 2022-08-04 17:59:46
 * @FilePath: \LeetCode\226.翻转二叉树.java
 */
/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
     * @description: 递归法交换
     * @param {TreeNode} root
     * @return {*}
     */
    // public TreeNode invertTree(TreeNode root) {
    // if (root == null)
    // return root;
    // invertTree(root.left);
    // invertTree(root.right);
    // swap(root);
    // return root;
    // }
    /*
     * 迭代法
     */
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null)
            stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (cur != null) {
                stack.pop();
                if (cur.right != null) {
                    stack.push(cur.right);
                }
                if (cur.left != null) {
                    stack.push(cur.left);
                }
                stack.push(cur);
                stack.push(null);
            } else {
                stack.pop();
                cur = stack.pop();
                swap(cur);
            }
        }
        return root;
    }

    private void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
// @lc code=end
