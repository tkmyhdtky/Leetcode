import java.util.Stack;

import javax.swing.plaf.TextUI;
import javax.swing.tree.TreeNode;

/*
 * @Date: 2022-08-05 10:31:16
 * @LastEditTime: 2022-08-05 14:05:23
 * @FilePath: \LeetCode\572.另一棵树的子树.java
 */
/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一棵树的子树
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        return compare(root, subRoot);
    }

    private boolean compare(TreeNode root, TreeNode subRoot) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node == null) {
                continue;
            }
            if (node.val == subRoot.val && compareTree(node, subRoot)) {
                return true;
            } else {
                stack.push(node.left);
                stack.push(node.right);
            }
        }
        return false;
    }

    /**
     * @description: 迭代法
     * @param {TreeNode} root
     * @param {TreeNode} subRoot
     * @return {*}
     */
    // private boolean compareTree(TreeNode root, TreeNode subRoot) {
    //     Stack<TreeNode> stack = new Stack<>();
    //     stack.push(root);
    //     stack.push(subRoot);
    //     while (!stack.isEmpty()) {
    //         TreeNode node1 = stack.pop();
    //         TreeNode node2 = stack.pop();
    //         if (node1 == null && node2 == null) {
    //             continue;
    //         }
    //         if (node1 == null || node2 == null || (node1.val != node2.val)) {
    //             return false;
    //         }
    //         stack.push(node1.left);
    //         stack.push(node2.left);
    //         stack.push(node1.right);
    //         stack.push(node2.right);
    //     }
    //     return true;
    // }
    /*
     * 递归
     */
    private boolean compareTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null) {
            return true;
        }else if (p!=null&&q==null) {
            return false;
        }else if (p==null&&q!=null) {
            return false;
        }else if (p.val!=q.val) {
            return false;
        }
        return compareTree(p.left,q.left)&&compareTree(p.right,q.right);
    }
}
// @lc code=end
