/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-04 19:07:52
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-04 19:35:02
 * @FilePath: \LeetCode\738.单调递增的数字.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
/*
 * @lc app=leetcode.cn id=738 lang=java
 *
 * [738] 单调递增的数字
 *
 * https://leetcode.cn/problems/monotone-increasing-digits/description/
 *
 * algorithms
 * Medium (50.12%)
 * Likes:    268
 * Dislikes: 0
 * Total Accepted:    63.1K
 * Total Submissions: 125.9K
 * Testcase Example:  '10'
 *
 * 当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。
 * 
 * 给定一个整数 n ，返回 小于或等于 n 的最大数字，且数字呈 单调递增 。
 * 
 * 
 * 
 * 示例 1:
 * 
 * 
 * 输入: n = 10
 * 输出: 9
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: n = 1234
 * 输出: 1234
 * 
 * 
 * 示例 3:
 * 
 * 
 * 输入: n = 332
 * 输出: 299
 * 
 * 
 * 
 * 
 * 提示:
 * 
 * 
 * 0 <= n <= 10^9
 * 
 * 
 */

// @lc code=start
class Solution {
    public int monotoneIncreasingDigits(int n) {
        String num = String.valueOf(n);
        char[] chars = num.toCharArray();
        int flag=num.length();
        for (int i = num.length()-1; i > 0; i--) {
            if (chars[i] < chars[i - 1]) {
                chars[i-1]--;
                flag=i;
            }
        }
        for (int i = flag; i < num.length(); i++) {
            chars[i]='9';
        }
        return Integer.parseInt(String.valueOf(chars));
    }
}
// @lc code=end
