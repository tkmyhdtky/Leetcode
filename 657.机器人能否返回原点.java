/*
 * @Date: 2022-08-03 15:19:23
 * @LastEditTime: 2022-08-03 15:20:37
 * @FilePath: \LeetCode\657.机器人能否返回原点.java
 */
/*
 * @lc app=leetcode.cn id=657 lang=java
 *
 * [657] 机器人能否返回原点
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'R') {
                x++;
            } else if (c == 'L') {
                x--;
            }
        }
        return x == 0 && y == 0;
    }
}
// @lc code=end
