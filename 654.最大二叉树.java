import java.util.Arrays;

/*
 * @Date: 2022-09-06 10:29:58
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-06 10:57:36
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
    // public TreeNode constructMaximumBinaryTree(int[] nums) {
    // TreeNode node = new TreeNode();
    // // 终止条件：传入的数组大小为1，说明遍历到了叶子节点了。
    // // 那么应该定义一个新的节点，并把这个数组的数值赋给新的节点，然后返回这个节点
    // if (nums.length == 1) {
    // node.val = nums[0];
    // return node;
    // }
    // /*
    // * 单层递归逻辑：
    // * 1. 先要找到数组中最大的值和对应的下标，最大的值构造根节点，下标用来下一步分割数组。
    // */
    // int maxValue = 0;
    // int maxValueIndex = 0;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] > maxValue) {
    // maxValue = nums[i];
    // maxValueIndex = i;
    // }
    // }
    // node.val = maxValue;
    // // 2.最大值所在的下标左区间 构造左子树
    // if (maxValueIndex > 0) {
    // int[] left = Arrays.copyOfRange(nums, 0, maxValueIndex);
    // node.left = constructMaximumBinaryTree(left);
    // }
    // // 3.最大值所在的下标右区间 构造右子树,确保右区间至少有一个数值。
    // if (maxValueIndex < nums.length - 1) {
    // int[] right = Arrays.copyOfRange(nums, maxValueIndex + 1, nums.length);
    // node.right = constructMaximumBinaryTree(right);
    // }
    // return node;
    // }

    /**
     * @description: 优化:每次分隔不用定义新的数组，通过下标索引直接在原数组上操作。
     * @param {int[]} nums
     * @return {*}
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traversal(nums, 0, nums.length);
    }

    private TreeNode traversal(int[] nums, int left, int right) {
        if (left >= right)
            return null;

        // 分割点下标：maxValueIndex
        int maxValueIndex = left;
        for (int i = left + 1; i < right; i++) {
            if (nums[i] > nums[maxValueIndex]) {
                maxValueIndex = i;
            }
        }
        TreeNode root = new TreeNode(nums[maxValueIndex]);
        // 左闭右开：[left, maxValueIndex)
        root.left = traversal(nums, left, maxValueIndex);

        // 左闭右开：[maxValueIndex+1,right]
        root.right = traversal(nums, maxValueIndex + 1, right);
        return root;
    }
}
// @lc code=end
