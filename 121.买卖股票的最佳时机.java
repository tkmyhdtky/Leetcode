/*
 * @Date: 2022-07-16 09:17:32
 * @LastEditTime: 2022-07-16 09:35:22
 * @FilePath: \学习笔记d:\VSCode\LeetCode\121.买卖股票的最佳时机.java
 */
/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    /**
     * @description: 贪心算法
     */
    // public int maxProfit(int[] prices) {
    // int low = prices[0];
    // int res = 0;
    // for (int i = 0; i < prices.length; i++) {
    // low = Math.min(low, prices[i]);
    // res = Math.max(res, prices[i] - low);
    // }
    // return res;
    // }
    /**
     * @description: 动态规划
     */
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];
        if (prices.length == 0) {
            return 0;
        }
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], prices[i] + dp[i - 1][0]);
        }
        return dp[prices.length - 1][1];
    }
}
// @lc code=end
