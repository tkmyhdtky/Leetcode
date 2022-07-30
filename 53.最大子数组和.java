/*
 * @Date: 2022-07-18 20:27:55
 * @LastEditTime: 2022-07-20 22:05:05
 * @FilePath: \Leetcode\53.最大子数组和.java
 */
/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 *
 * https://leetcode.cn/problems/maximum-subarray/description/
 *
 * algorithms
 * Easy (54.81%)
 * Likes:    5054
 * Dislikes: 0
 * Total Accepted:    1.1M
 * Total Submissions: 2M
 * Testcase Example:  '[-2,1,-3,4,-1,2,1,-5,4]'
 *
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 
 * 子数组 是数组中的一个连续部分。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
 * 输出：6
 * 解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [1]
 * 输出：1
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：nums = [5,4,-1,7,8]
 * 输出：23
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * 
 * 
 * 
 * 
 * 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。
 * 
 */

// @lc code=start
class Solution {
    /**
     * @description: 贪心算法
     * @param {int[]} nums
     * @return {*}
     */
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            res = Math.max(sum, res);
            if (sum < 0) {
                sum = 0;
            }
        }
        return res;
    }
    /**
     * @description: 动态规划
     * @param {int[]} nums
     * @return {*}
     */
    // public int maxSubArray(int[] nums) {
    // int dp[] = new int[nums.length];
    // dp[0] = nums[0];
    // int res = dp[0];
    // for (int i = 1; i < dp.length; i++) {
    // dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
    // res = res > dp[i] ? res : dp[i];
    // }
    // return res;
    // }
}
// @lc code=end
