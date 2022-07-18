/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-06 22:15:51
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-09 09:04:15
 * @FilePath: \LeetCode\96. 不同的二叉搜索树.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
class Solution {
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                dp[i]+=dp[j-1]*dp[i-1];
            }
        }
        return dp[n];
    }
}