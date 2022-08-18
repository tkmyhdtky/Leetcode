/*
 * @Date: 2022-08-03 15:07:05
 * @LastEditTime: 2022-08-03 15:17:12
 * @FilePath: \LeetCode\551.学生出勤记录-i.java
 */
/*
 * @lc app=leetcode.cn id=551 lang=java
 *
 * [551] 学生出勤记录 I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        int numA = 0;
        int numL = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                numA++;
                numL = 0;
            } else if (c == 'L') {
                numL++;
                if (numL >= 3) {
                    return false;
                }
            } else if (c == 'P') {
                numL = 0;
            }
        }
        if (numA < 2)
            return true;
        return false;
    }
}
// @lc code=end
