import java.util.HashSet;
import java.util.Set;

/*
 * @Date: 2022-07-30 12:44:21
 * @LastEditTime: 2022-07-30 13:15:34
 * @FilePath: \Leetcode\202.快乐数.java
 */
/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getSum(n);
        }
        return n == 1;
    }

    private int getSum(int n) {
        int res = 0;
        while (n != 0) {
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }
}
// @lc code=end
