/*
 * @Date: 2022-09-11 14:18:47
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-11 14:27:18
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=538 lang=java
 *
 * [538] 把二叉搜索树转换为累加树
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
    int sum;
    private void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.right);
        sum+=root.val;
        root.val = sum;
        traversal(root.left);
    }

    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        traversal(root);
        return root;
    }
}
// @lc code=end
