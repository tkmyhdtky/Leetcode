/*
 * @Date: 2022-07-18 15:06:11
 * @LastEditTime: 2022-07-18 15:17:33
 * @FilePath: \LeetCode\309.最佳买卖股票时机含冷冻期.java
 */
/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if (len == 0)
            return 0;
        int dp[][] = new int[len][4];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = 0;
        dp[0][3] = 0;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][3] - prices[i], dp[i - 1][1] - prices[i]));
                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][3]);
                dp[i][2] = dp[i - 1][0] + prices[i];
                dp[i][3] = dp[i - 1][2];
            }
        }
        return Math.max(dp[len - 1][1], Math.max(dp[len - 1][2], dp[len - 1][3]));
    }
}
// @lc code=end
