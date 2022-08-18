/*
 * @Date: 2022-08-01 16:19:48
 * @LastEditTime: 2022-08-01 16:42:16
 * @FilePath: \LeetCode\520.检测大写字母.java
 */
/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    // public boolean detectCapitalUse(String word) {
    // int[] record = new int[word.length()];
    // for (int i = 0; i < record.length; i++) {
    // char c = word.charAt(i);
    // if (c >= 'A' && c <= 'Z') {
    // record[i] = 1;
    // }
    // }

    // int sum = 0;
    // for (int j = 0; j < record.length; j++) {
    // sum += record[j];
    // }
    // if (sum == word.length() || (sum == 1 && record[0] == 1) || sum == 0) {
    // return true;
    // }
    // return false;
    // }
    public boolean detectCapitalUse(String word) {
        if (word.length() >= 2 && Character.isLowerCase(word.charAt(0))
                && Character.isUpperCase(word.charAt(1))) {
            return false;
        }
        for (int i = 2; i < word.length(); ++i) {
            if (Character.isLowerCase(word.charAt(i)) ^ Character.isLowerCase(word.charAt(1))) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
