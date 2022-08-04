import java.rmi.server.RemoteStub;
import java.util.Deque;

import javax.swing.tree.TreeNode;

/*
 * @Date: 2022-08-04 17:29:29
 * @LastEditTime: 2022-08-04 17:35:07
 * @FilePath: \LeetCode\104.二叉树的最大深度.java
 */
/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int maxDepth(TreeNode root) {
        int res=level(root);
        return res;
    }

    private int level(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        int maxdepth=0;
        if (root != null)
            deque.offer(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            maxdepth++;
            while (len > 0) {
                TreeNode cur = deque.poll();
                if (cur.left != null)
                    deque.offer(cur.left);
                if (cur.right != null)
                    deque.offer(cur.right);
                len--;
            }
        }
        return maxdepth;
    }
}
// @lc code=end
