/*
 * @Date: 2022-07-25 21:59:20
 * @LastEditTime: 2022-07-29 14:23:17
 * @FilePath: \LeetCode\367.有效的完全平方数.java
 */
/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num==1) {
            return true;
        }
        int left = 0;
        int right = num/2;
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

