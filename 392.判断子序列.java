/*
 * @Date: 2022-07-20 22:06:01
 * @LastEditTime: 2022-07-29 10:40:05
 * @FilePath: \LeetCode\392.判断子序列.java
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int dp[][] = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        
        if (dp[s.length()][t.length()]==s.length()) {
            return true;
        }else{
            return false;
        }
    }
}
// @lc code=end
