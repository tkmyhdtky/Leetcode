/*
 * @Date: 2022-12-29 14:06:27
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-29 14:22:42
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            /**
             * 单词的两个条件：
             * 1. 首字母下标对应的字符不为空格
             * 2. 首字母下标为初始下标或者首字母下标的前下标对应的字符为空格
             */
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                res++;
            }
        }
        return res;
    }
}
// @lc code=end
