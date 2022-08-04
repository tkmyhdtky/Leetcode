import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @Date: 2022-08-04 10:46:20
 * @LastEditTime: 2022-08-04 16:02:07
 * @FilePath: \LeetCode\144.二叉树的前序遍历.java
 */
/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        preOrder(root, list);
        return list;
    }

    /**
     * @description: 递归前序遍历
     * @param {TreeNode}      root
     * @param {List<Integer>} list
     * @return {*}
     */
    // private void preOrder(TreeNode root, List<Integer> list) {
    // if (root == null) {
    // return;
    // }
    // list.add(root.val);
    // preOrder(root.left,list);
    // preOrder(root.right,list);
    // }
    /**
     * @description: 迭代前序遍历
     * @param {TreeNode}      root
     * @param {List<Integer>} list
     * @return {*}
     */
    // private void preOrder(TreeNode root, List<Integer> list) {
    // Stack<TreeNode> stack = new Stack<>();
    // stack.push(root);
    // while (!stack.isEmpty()) {
    // TreeNode cur = stack.pop();
    // if (cur.right != null)
    // stack.push(cur.right);
    // if (cur.left != null)
    // stack.push(cur.left);
    // list.add(cur.val);
    // }
    // }
    /*
     * 标记法前序遍历
     */
    private void preOrder(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (cur != null) {
                stack.pop();
                if (cur.right != null)
                    stack.push(cur.right);
                if (cur.left != null)
                    stack.push(cur.left);
                stack.push(cur);
                stack.push(null);
            } else {
                stack.pop();
                cur = stack.pop();
                list.add(cur.val);
            }
        }
    }
}
// @lc code=end
