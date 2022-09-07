import java.util.ArrayDeque;
import java.util.Deque;

import javax.swing.tree.TreeNode;

/*
 * @Date: 2022-09-06 14:20:17
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-06 14:39:05
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
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
    // public class TreeNode {
    //     int val;
    //     TreeNode left;
    //     TreeNode right;

    //     TreeNode() {
    //     }

    //     TreeNode(int val) {
    //         this.val = val;
    //     }

    //     TreeNode(int val, TreeNode left, TreeNode right) {
    //         this.val = val;
    //         this.left = left;
    //         this.right = right;
    //     }
    // }

    /**
     * @description: 递归法
     * @param {TreeNode} root1
     * @param {TreeNode} root2
     * @return {*}
     */
    // public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    // if (root1 == null) {
    // // 如果root1为空，合并之后就应该是root2
    // return root2;
    // }
    // if (root2 == null) {
    // // 如果root2为空，合并之后就应该是root1
    // return root1;
    // }
    // root1.val += root2.val;
    // root1.left = mergeTrees(root1.left, root2.left);
    // root1.right = mergeTrees(root1.right, root2.right);
    // return root1;
    // }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root1);
        deque.offer(root2);
        while (!deque.isEmpty()) {
            TreeNode node1 = deque.poll();
            TreeNode node2 = deque.poll();
            node1.val += node2.val;
            // 如果两棵树左节点都不为空，加入队列
            if (node1.left != null && node2.left != null) {
                deque.offer(node1.left);
                deque.offer(node2.left);
            }
            // 如果两棵树右节点都不为空，加入队列
            if (node1.right != null && node2.right != null) {
                deque.offer(node1.right);
                deque.offer(node2.right);
            }
            // 当t1的左节点为空，直接赋值过去
            if (node1.left == null && node2.left != null) {
                node1.left = node2.left;
            }
            // 当node1的右节点为空,直接赋值过去
            if (node1.right == null && node2.right != null) {
                node1.right = node2.right;
            }
        }
        return root1;
    }
}
// @lc code=end
