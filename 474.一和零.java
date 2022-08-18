/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-12 21:55:56
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-12 22:08:10
 * @FilePath: \LeetCode\474.一和零.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AEf
 */
/*
 * @lc app=leetcode.cn id=474 lang=java
 *
 * [474] 一和零
 */

// @lc code=start
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];
        for (String str : strs) {
            int oneNum = 0, zeroNum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1')
                    oneNum++;
                else
                    zeroNum++;
            }
            for (int i = m; i >= zeroNum; i--) {
                for (int j = n; j >= oneNum; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zeroNum][j - oneNum] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end
