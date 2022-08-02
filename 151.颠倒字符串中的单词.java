/*
 * @Date: 2022-08-02 09:28:15
 * @LastEditTime: 2022-08-02 10:00:48
 * @FilePath: \LeetCode\151.颠倒字符串中的单词.java
 */
/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 颠倒字符串中的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = removeExtraSpace(s);
        reverseString(sb, 0, sb.length() - 1);
        reverseEachWord(sb);
        return sb.toString();
    }

    /*
     * 去除首尾以及中间多余的空格
     */
    private StringBuilder removeExtraSpace(String s) {
        int slow = 0;
        int fast = s.length() - 1;
        while (s.charAt(slow) == ' ')
            slow++;
        while (s.charAt(fast) == ' ')
            fast--;
        StringBuilder sb = new StringBuilder();
        while (slow <= fast) {
            char temp = s.charAt(slow);
            if (temp != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(temp);
            }
            slow++;
        }
        System.out.println(sb.toString());
        return sb;
    }

    /*
     * 反转指定区间的字符串
     */
    private void reverseString(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    /*
     * 反转每个单词
     */
    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end-1);
            start = end + 1;
            end = start + 1;
        }
        System.out.println(sb.toString());
    }
}
// @lc code=end
