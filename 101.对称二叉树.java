import java.util.Stack;

/*
 * @Date: 2022-08-05 09:58:47
 * @LastEditTime: 2022-08-05 10:20:47
 * @FilePath: \LeetCode\101.对称二叉树.java
 */
/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root);
    }

    /**
     * @description: 递归法
     * @param {TreeNode} left
     * @param {TreeNode} right
     * @return {*}
     */
    // private boolean compare(TreeNode left, TreeNode right) {
    // if (left == null && right == null) {
    // return true;
    // } else if (left != null && right == null) {
    // return false;
    // } else if (left == null && right != null) {
    // return false;
    // } else if (left.val != right.val) {
    // return false;
    // }
    // return compare(left.right, right.left)&&compare(left.left, right.right);
    // }
    /*
     * 迭代法
     */
    private boolean compare(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.isEmpty()) {
            TreeNode node1 = stack.pop();
            TreeNode node2 = stack.pop();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || (node1.val != node2.val)) {
                return false;
            }
            stack.push(node1.left);
            stack.push(node2.right);
            stack.push(node2.left);
            stack.push(node1.right);
        }
        return true;
    }
    // public class TreeNode {
    // int val;
    // TreeNode left;
    // TreeNode right;

    // TreeNode() {
    // }

    // TreeNode(int val) {
    // this.val = val;
    // }

    // TreeNode(int val, TreeNode left, TreeNode right) {
    // this.val = val;
    // this.left = left;
    // this.right = right;
    // }
    // }
}
// @lc code=end
