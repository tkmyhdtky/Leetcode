/*
 * @Date: 2022-07-16 09:44:28
 * @LastEditTime: 2022-07-16 10:04:45
 * @FilePath: \学习笔记d:\VSCode\LeetCode\123.买卖股票的最佳时机-iii.java
 */
/*
 * @lc app=leetcode.cn id=123 lang=java
 *
 * [123] 买卖股票的最佳时机 III
 */

// @lc code=start
class Solution {
    /**
     * @description: 五种状态：无操作，第一次买/卖，第二次买/卖
     * @param {int[]} prices
     * @return {*}
     */
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0)
            return 0;
        int dp[][] = new int[len][5];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;
        dp[0][3] = -prices[0];
        dp[0][4] = 0;
        for (int i = 1; i < len; i++) {
            dp[i][0] =dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }
        return dp[len-1][4];
    }
}
// @lc code=end
