/*
 * @Date: 2022-08-02 15:43:41
 * @LastEditTime: 2022-08-02 18:58:19
 * @FilePath: \LeetCode\28.实现-str-str.java
 */
/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int[] next = new int[needle.length()];
        getNext(next, needle);
        int j = -1; // j指向模式串起始位置
        for (int i = 0; i < haystack.length(); i++) {
            // i 指向文本串起始位置。
            while (j >= 0 && haystack.charAt(i) != needle.charAt(j + 1)) {
                j = next[j];
            }
            if (haystack.charAt(i) == needle.charAt(j + 1)) {
                j++;
            }
            if (j == needle.length() - 1) {
                return (i - needle.length() + 1);
            }
        }
        return -1;
    }

    /*
     * 构造next数组
     */
    private void getNext(int[] next, String s) {
        int i; // 后缀末尾
        int j = -1; // 前缀末尾，前缀表要统一减一
        next[0] = j;
        for (i = 1; i < s.length(); i++) {
            while (j >= 0 && s.charAt(j + 1) != s.charAt(i)) {
                j = next[j];// 向前回退
            }
            if (s.charAt(i) == s.charAt(j + 1)) {
                j++;
            }
            next[i] = j;// 将j（前缀的长度）赋给next[i]
        }
    }
}
// @lc code=end
