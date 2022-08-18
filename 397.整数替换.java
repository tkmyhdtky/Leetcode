/*
 * @Date: 2022-07-28 13:54:29
 * @LastEditTime: 2022-07-28 14:32:03
 * @FilePath: \LeetCode\397.整数替换.java
 */
/*
 * @lc app=leetcode.cn id=397 lang=java
 *
 * [397] 整数替换
 */

// @lc code=start
class Solution {
    public int integerReplacement(int n) {
        int res = 0;
        if (n == 1)
            return 0;
        if (n % 2 == 1) {
            res = Math.min(integerReplacement(n / 2),
                    integerReplacement(n / 2 + 1)) + 2;
        } else {
            res = integerReplacement(n / 2) + 1;
        }
        return res;
    }
}
// @lc code=end
