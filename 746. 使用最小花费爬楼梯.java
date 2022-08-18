/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-05 19:56:51
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-05 20:02:57
 * @FilePath: \LeetCode\746. 使用最小花费爬楼梯.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }
        if (cost.length == 1) {
            return cost[0];
        }
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
    }
}
