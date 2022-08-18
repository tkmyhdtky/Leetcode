import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        levelOrder(root, list);
        return list;
    }

    private void levelOrder(TreeNode root, List<Integer> list) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root != null)
            deque.offer(root);
        while (!deque.isEmpty()) {
            int dequelen = deque.size();
            for (int i = 0; i < dequelen; i++) {
                TreeNode cur = deque.pollFirst();
                if (cur.right != null) {
                    deque.offer(cur.right);
                }
                if (cur.left != null) {
                    deque.offer(cur.left);
                }
                if (i == 0) {
                    list.add(cur.val);
                }
            }
        }
    }
}
// @lc code=end
