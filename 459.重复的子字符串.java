/*
 * @Date: 2022-08-02 17:49:38
 * @LastEditTime: 2022-08-02 19:24:29
 * @FilePath: \LeetCode\459.重复的子字符串.java
 */
/*
 * @lc app=leetcode.cn id=459 lang=java
 *
 * [459] 重复的子字符串
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        int[] next = new int[len];
        getNext(next, s);
        if (next[len - 1] != -1 && len % (len - (next[len - 1] + 1)) == 0) {
            return true;
        }
        return false;
    }

    public void getNext(int[] next, String s) {
        int i; // 后缀末尾
        int j = -1; // 前缀末尾
        next[0]=j;
        for (i = 1; i < s.length(); i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;
        }
    }
}
// @lc code=end
