import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    // public void flatten(TreeNode root) {
    // List<TreeNode> list = new ArrayList<TreeNode>();
    // preorderTraversal(root, list);
    // int size = list.size();
    // for (int i = 1; i < size; i++) {
    // TreeNode prev = list.get(i - 1), curr = list.get(i);
    // prev.left = null;
    // prev.right = curr;
    // }
    // }

    // public void preorderTraversal(TreeNode root, List<TreeNode> list) {
    // if (root != null) {
    // list.add(root);
    // preorderTraversal(root.left, list);
    // preorderTraversal(root.right, list);
    // }
    // }
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        while (cur != null) {
            if (cur.left != null) {
                TreeNode next = cur.left;
                TreeNode end = next;
                while (end.right != null) {
                    end = end.right;
                }
                end.right = cur.right;
                cur.left = null;
                cur.right = next;
            }
            cur = cur.right;
        }
    }
}
// @lc code=end
