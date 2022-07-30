/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-04 20:01:34
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-04 20:10:04
 * @FilePath: \LeetCode\70.爬楼梯.java
 * @Description:   
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 *
 * https://leetcode.cn/problems/climbing-stairs/description/
 *
 * algorithms
 * Easy (53.77%)
 * Likes:    2501
 * Dislikes: 0
 * Total Accepted:    873.9K
 * Total Submissions: 1.6M
 * Testcase Example:  '2'
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 3
 * 输出：3
 * 解释：有三种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶 + 1 阶
 * 2. 1 阶 + 2 阶
 * 3. 2 阶 + 1 阶
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= n <= 45
 * 
 * 
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int f1 = 1;
        int f2 = 2;
        if (n==1) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            int temp = f1 + f2;
            f1=f2;
            f2=temp;
        }
        return f2;
    }
}
// @lc code=end
