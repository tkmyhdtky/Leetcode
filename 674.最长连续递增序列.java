import java.util.Arrays;

/*
 * @Date: 2022-07-18 21:15:54
 * @LastEditTime: 2022-07-18 21:29:35
 * @FilePath: \Leetcode\674.最长连续递增序列.java
 */
/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    /**
     * @description: 贪心算法
     * @param {int[]} nums
     * @return {*}
     */
    // public int findLengthOfLCIS(int[] nums) {
    // int res = 1;
    // int temp = 1;
    // for (int i = 0; i < nums.length - 1; i++) {
    // if (nums[i] < nums[i + 1]) {
    // temp++;
    // res = Math.max(res, temp);
    // } else {
    // temp = 1;
    // }
    // }
    // return res;
    // }
    /**
     * @description: 动态规划
     * @param {int[]} nums
     * @return {*}
     */
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < dp.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        int res=0;
        for (int i = 0; i < dp.length; i++) {
            res=Math.max(res, dp[i]);
        }
        return res;
    }
}
// @lc code=end
