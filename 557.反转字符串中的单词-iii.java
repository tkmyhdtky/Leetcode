/*
 * @Date: 2022-08-02 15:08:51
 * @LastEditTime: 2022-08-02 15:39:47
 * @FilePath: \LeetCode\557.反转字符串中的单词-iii.java
 */
/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end-1);
            start=end+1;
            end=start+1;
        }
        return sb.toString();
    }

    private void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

}
// @lc code=end
