/*
 * @Date: 2022-07-25 21:59:20
 * @LastEditTime: 2022-07-25 22:00:06
 * @FilePath: \Leetcode\367.有效的完全平方数.java
 */
/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        int res = -1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if ((long) mid * mid <= num) {
                left = mid + 1;
                res = mid;
            } else {
                right = mid - 1;
            }
        }
        return res*res==num?true:false;
    }
}
// @lc code=end

