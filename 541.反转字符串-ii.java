/*
 * @Date: 2022-07-31 10:51:53
 * @LastEditTime: 2022-07-31 20:38:21
 * @FilePath: \Leetcode\541.反转字符串-ii.java
 */
/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i += 2 * k) {
            int start = i;
            int end = Math.min(c.length - 1, start + k - 1);
            while (start < end) {
                c[start] ^= c[end];
                c[end] ^= c[start];
                c[start] ^= c[end];
                start++;
                end--;
            }
        }
        return new String(c);
    }
}
// @lc code=end
