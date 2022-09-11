/*
 * @Date: 2022-09-11 13:48:56
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-11 14:18:01
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return traversal(nums, 0, nums.length - 1);
    }

    public TreeNode traversal(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + ((right - left) / 2);
        // 以中间位置的元素构造节点
        TreeNode node = new TreeNode(nums[mid]);
        node.left = traversal(nums, left, mid - 1);
        node.right = traversal(nums, mid + 1, right);
        return node;
    }
}
// @lc code=end
