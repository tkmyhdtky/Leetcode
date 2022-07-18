/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-05 20:04:36
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-05 20:13:05
 * @FilePath: \LeetCode\62. 不同路径.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++)
            dp[i][0] = 1;
        for (int i = 0; i < n; i++)
            dp[0][i] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}
