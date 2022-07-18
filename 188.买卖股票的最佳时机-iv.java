/*
 * @Date: 2022-07-18 13:13:10
 * @LastEditTime: 2022-07-18 13:22:54
 * @FilePath: \Space01d:\Documents\VSCode\LeetCode\188.买卖股票的最佳时机-iv.java
 */
/*
 * @lc app=leetcode.cn id=188 lang=java
 *
 * [188] 买卖股票的最佳时机 IV
 */

// @lc code=start
class Solution {
    public int maxProfit(int k, int[] prices) {

        if (prices.length == 0)
            return 0;
        int dp[][] = new int[prices.length][k * 2 + 1];
        dp[0][0] = 0;
        for (int i = 1; i < 2 * k; i += 2) {
            dp[0][i] -= prices[0];
        }
        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < 2 * k - 1; j += 2) {
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }
        }
        return dp[prices.length - 1][2 * k];
    }
}
// @lc code=end
