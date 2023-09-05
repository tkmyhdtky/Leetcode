/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */

// @lc code=start
class Solution263 {
    public boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        while (true) {
            if (n % 5 == 0)
                n /= 5;
            else if (n % 3 == 0)
                n /= 3;
            else if (n % 2 == 0)
                n /= 2;
            else break;
        }
        return n == 1;
    }
}
// @lc code=end
