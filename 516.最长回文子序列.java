/*
 * @Date: 2022-07-21 21:46:12
 * @LastEditTime: 2022-07-21 22:10:11
 * @FilePath: \Leetcode\516.最长回文子序列.java
 */
/*
 * @lc app=leetcode.cn id=516 lang=java
 *
 * [516] 最长回文子序列
 */

// @lc code=start
class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][] = new int[s.length()+1][s.length()+1];
        for (int i = 0; i < s.length(); i++)
            dp[i][i] = 1;
        for (int i = s.length(); i >= 0; i--) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][s.length() - 1];
    }
}
// @lc code=end
