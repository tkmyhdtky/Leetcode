/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-10 16:32:59
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-10 16:52:00
 * @FilePath: \LeetCode\494.目标和.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (Math.abs(target) > sum)
            return 0;
        if ((sum + target) % 2 == 1)
            return 0;
        int bagSize = (sum + target) / 2;
        int dp[] = new int[bagSize + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = bagSize; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[bagSize];
    }

}
// @lc code=end
