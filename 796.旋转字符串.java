
/*
 * @Date: 2022-08-02 14:30:12
 * @LastEditTime: 2022-08-02 15:29:49
 * @FilePath: \LeetCode\796.旋转字符串.java
 */
/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        int m = s.length(), n = goal.length();
        if (m != n) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < m; j++) {
                if ((s.charAt((i + j) % n)) != goal.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
