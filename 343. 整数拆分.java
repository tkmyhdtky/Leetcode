/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-06 21:39:55
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-06 21:55:11
 * @FilePath: \LeetCode\343. 整数拆分.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
class Solution {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i < dp.length; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max(dp[i - j] * j, j * (i - j)));
            }
        }
        return dp[n];
    }
}