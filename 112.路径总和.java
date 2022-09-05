import java.util.Map;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @Date: 2022-08-24 09:42:31
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-03 15:29:41
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    // public boolean hasPathSum(TreeNode root, int targetSum) {
    // if (root == null) {
    // return false;
    // }
    // return traversal(root, targetSum - root.val);
    // }

    // boolean traversal(TreeNode cur, int count) {
    // // 终止条件
    // if (cur.left == null && cur.right == null && count == 0) {
    // return true;
    // }
    // if (cur.left == null && cur.right == null) {
    // return false;
    // }

    // // 递归逻辑
    // if (cur.left != null) {
    // if (traversal(cur.left, count - cur.left.val)) {
    // return true;
    // }
    // }
    // if (cur.right != null) {
    // if (traversal(cur.right, count - cur.right.val)) {
    // return true;
    // }
    // }
    // return false;
    // }

    /**
     * @description: 递归法精简版本
     * @param {TreeNode} root
     * @param {int}      targetSum
     * @return {*}
     */
    // public boolean hasPathSum(TreeNode root, int targetSum) {
    // if (root==null) {
    // return false;
    // }
    // if (root.left==null&&root.right==null&&targetSum==root.val) {
    // return true;
    // }
    // return hasPathSum(root.left, targetSum-root.val)||hasPathSum(root.right,
    // targetSum-root.val);
    // }

    /**
     * @description: 迭代法
     * @param {TreeNode} root
     * @param {int}      targetSum
     * @return {*}
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(root);
        stack2.push(root.val);
        while (!stack1.isEmpty()) {
            int size = stack1.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = stack1.pop();
                int sum = stack2.pop();
                if (node.left == null && node.right == null && sum == targetSum) {
                    return true;
                }
                if (node.right != null) {
                    stack1.push(node.right);
                    stack2.push(node.right.val + sum);
                }
                if (node.left != null) {
                    stack1.push(node.left);
                    stack2.push(node.left.val + sum);
                }
            }
        }
        return false;
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
