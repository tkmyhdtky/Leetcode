import java.io.Serial;

/*
 * @Date: 2022-09-06 14:40:11
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-06 18:09:58
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=700 lang=java
 *
 * [700] 二叉搜索树中的搜索
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
    /**
     * @description: 递归法
     * @param {TreeNode} root
     * @param {int}      val
     * @return {*}
     */
    // public TreeNode searchBST(TreeNode root, int val) {
    // if (root == null || root.val == val) {
    // return root;
    // }
    // if (root.val > val) {
    // return searchBST(root.left, val);
    // }
    // if (root.val < val) {
    // return searchBST(root.right, val);
    // }
    // return null;
    // }
    /**
     * @description: 迭代法
     * @param {TreeNode} root
     * @param {int}      val
     * @return {*}
     */
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val > val) {
                root = root.left;
            } else if (root.val < val) {
                root = root.right;
            } else
                return root;
        }
        return null;
    }
}
// @lc code=end
