import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * @Date: 2022-08-04 17:36:06
 * @LastEditTime: 2022-08-04 17:44:00
 * @FilePath: \LeetCode\111.二叉树的最小深度.java
 */
/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
    public int minDepth(TreeNode root) {
        int res = level(root);
        return res;
    }

    private int level(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root != null)
            deque.offer(root);
        int depth = 0;
        while (!deque.isEmpty()) {
            int len = deque.size();
            depth++;
            while (len > 0) {
                TreeNode cur = deque.poll();
                if (cur.left == null && cur.right == null) {
                    return depth;
                }
                if (cur.left != null)
                    deque.offer(cur.left);
                if (cur.right != null)
                    deque.offer(cur.right);
                len--;
            }
        }
        return 0;
    }
}
// @lc code=end
