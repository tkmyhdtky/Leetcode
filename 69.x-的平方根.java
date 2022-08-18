/*
 * @Date: 2022-07-25 21:37:05
 * @LastEditTime: 2022-07-25 21:58:55
 * @FilePath: \Leetcode\69.x-的平方根.java
 */
/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int res = -1;
        while (left <= right) {
            int mid = left + ((right - left) >> 2);
            if ((long) mid * mid <= x) {
                left = mid + 1;
                res = mid;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
// @lc code=end
