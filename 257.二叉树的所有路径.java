import java.util.List;

/*
 * @Date: 2022-08-08 08:48:14
 * @LastEditTime: 2022-08-18 15:59:45
 * @FilePath: \Leetcode\257.二叉树的所有路径.java
 */
/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {

    }

    private void traversal(TreeNode cur, String path, List<String> result) {
        if (cur.left == null && cur.right == null) {
            return;
        }
    }
}
// @lc code=end
