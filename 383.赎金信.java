
/*
 * @Date: 2022-07-31 09:32:03
 * @LastEditTime: 2022-07-31 09:56:25
 * @FilePath: \Leetcode\383.赎金信.java
 */
/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record=new int[26];
        for (char c : magazine.toCharArray()) {
            record[c-'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            record[c-'a']--;
            if (record[c-'a']<0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
