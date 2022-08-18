
/*
 * @Date: 2022-08-05 14:42:25
 * @LastEditTime: 2022-08-05 16:16:55
 * @FilePath: \LeetCode\345.反转字符串中的元音字母.java
 */
/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            while (left < ch.length && !isVowel(ch[left])) {
                left++;
            }
            while (right >= 0 && !isVowel(ch[right])) {
                right--;
            }
            if (left<right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }

    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
}
// @lc code=end
