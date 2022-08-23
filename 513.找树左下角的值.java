import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @Date: 2022-08-23 20:32:37
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-08-23 21:00:05
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=513 lang=java
 *
 * [513] 找树左下角的值
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
    int maxLen = Integer.MIN_VALUE;
    int maxLeftValue = 0;

    public int findBottomLeftValue(TreeNode root) {
        traversal(root);
        return maxLeftValue;
    }

    // 递归法
    // private void traversal(TreeNode root, int leftLen) {
    // if (root.left == null && root.right == null) {
    // if (leftLen > maxLen) {
    // maxLen = leftLen;
    // maxLeftValue = root.val;
    // }
    // }
    // if (root.left != null) {
    // leftLen++;
    // traversal(root.left, leftLen);
    // leftLen--;
    // }
    // if (root.right != null) {
    // leftLen++;
    // traversal(root.right, leftLen);
    // leftLen--;
    // }
    // }
    private void traversal(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root != null)
            deque.offer(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = deque.poll();
                if (i == 0) {
                    maxLeftValue = node.val;
                }
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
            }
        }
    }
}
// @lc code=end
