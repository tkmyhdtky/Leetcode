import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/*
 * @Date: 2022-08-04 10:51:55
 * @LastEditTime: 2022-08-04 16:03:31
 * @FilePath: \LeetCode\145.二叉树的后序遍历.java
 */
/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        postOrder(root, list);
        return list;
    }

    /**
     * @description: 递归实现后序遍历
     * @param {TreeNode}      root
     * @param {List<Integer>} list
     * @return {*}
     */
    // private void postOrder(TreeNode root, List<Integer> list) {
    // if (root == null) {
    // return;
    // }
    // postOrder(root.left, list);
    // postOrder(root.right, list);
    // list.add(root.val);
    // }
    /**
     * @description: 迭代序遍历
     * @param {TreeNode}      root
     * @param {List<Integer>} list
     * @return {*}
     */
    // private void postOrder(TreeNode root, List<Integer> list) {
    // Stack<TreeNode> stack = new Stack<>();
    // stack.push(root);
    // while (!stack.isEmpty()) {
    // TreeNode cur = stack.pop();
    // if (cur.left != null)
    // stack.push(cur.left);
    // if (cur.right != null)
    // stack.push(cur.right);
    // list.add(cur.val);
    // }
    // Collections.reverse(list);
    // }
    /*
     * 标记法后序遍历
     */
    private void postOrder(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (cur != null) {
                stack.pop();
                stack.push(cur);
                stack.push(null);
                if (cur.right != null)
                    stack.push(cur.right);
                if (cur.left != null)
                    stack.push(cur.left);
               
            } else {
                stack.pop();
                cur = stack.pop();
                list.add(cur.val);
            }
        }
    }
}
// @lc code=end
