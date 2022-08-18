/*
 * @Date: 2022-07-18 15:21:14
 * @LastEditTime: 2022-07-18 15:34:34
 * @FilePath: \LeetCode\714.买卖股票的最佳时机含手续费.java
 */
/*
 * @lc app=leetcode.cn id=714 lang=java
 *
 * [714] 买卖股票的最佳时机含手续费
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int dp[] = new int[2];
        dp[0] = -prices[0];
        dp[1] = 0;
        for (int i = 1; i <= prices.length; i++) {
            dp[0] = Math.max(dp[0], dp[1] - prices[i - 1]);
            dp[1] = Math.max(dp[1], dp[0] + prices[i - 1] - fee);
        }
        return dp[1];
    }
}
// @lc code=end
