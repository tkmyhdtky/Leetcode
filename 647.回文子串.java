/*
 * @Date: 2022-07-21 21:23:10
 * @LastEditTime: 2022-07-21 21:37:39
 * @FilePath: \Leetcode\647.回文子串.java
 */
/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    /**
     * @description: 动态规划
     * @param {String} s
     * @return {*}
     */
    // public int countSubstrings(String s) {
    // boolean dp[][] = new boolean[s.length()][s.length()];
    // int res = 0;
    // for (int i = s.length()-1; i >= 0; i--) {
    // for (int j = i; j < dp.length; j++) {
    // if (s.charAt(i) == s.charAt(j)) {
    // if (j - i <= 1) {
    // dp[i][j] = true;
    // res++;
    // } else if(dp[i + 1][j - 1]){
    // dp[i][j] = true;
    // res++;
    // }
    // }
    // }
    // }
    // return res;
    // }
    /**
     * @description: 双指针
     * @param {String} s
     * @return {*}
     */
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += extend(s, i, i, s.length());
            res += extend(s, i, i + 1, s.length());
        }
        return res;
    }

    private int extend(String s, int i, int j, int n) {
        int res = 0;
        while (i >= 0 && j < n && s.charAt(i) == s.charAt(j)) {
            res++;
            i--;
            j++;
        }
        return res;
    }
}
// @lc code=end
