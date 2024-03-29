/*
 * @Date: 2022-07-14 09:11:07
 * @LastEditTime: 2022-07-29 10:39:34
 * @FilePath: \LeetCode\377.组合总和-ⅳ.java
 */
/*
 * @lc app=leetcode.cn id=377 lang=java
 *
 * [377] 组合总和 Ⅳ
 */

// @lc code=start
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int dp[] = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}
// test
// @lc code=end
