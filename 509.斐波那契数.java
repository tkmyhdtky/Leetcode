/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-04 19:49:33
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-04 19:59:09
 * @FilePath: \LeetCode\509.斐波那契数.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 *
 * https://leetcode.cn/problems/fibonacci-number/description/
 *
 * algorithms
 * Easy (66.64%)
 * Likes:    486
 * Dislikes: 0
 * Total Accepted:    410.2K
 * Total Submissions: 615.6K
 * Testcase Example:  '2'
 *
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * 
 * 
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 
 * 
 * 给定 n ，请计算 F(n) 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：n = 2
 * 输出：1
 * 解释：F(2) = F(1) + F(0) = 1 + 0 = 1
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：n = 3
 * 输出：2
 * 解释：F(3) = F(2) + F(1) = 1 + 1 = 2
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：n = 4
 * 输出：3
 * 解释：F(4) = F(3) + F(2) = 2 + 1 = 3
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 0 <= n <= 30
 * 
 * 
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        int n0 = 0;
        int n1 = 1;
        if (n==0) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            int temp = n1 + n0;
            n0=n1;
            n1=temp;
        }
        return n1;
    }
}
// @lc code=end
