/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-09 10:07:54
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-09 10:25:40
 * @FilePath: \LeetCode\416.分割等和子集.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0)
            return false;
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        // 和为奇数不能平分
        if (sum % 2 != 0)
            return false;
        int target = sum / 2;
        int dp[] = new int[target + 1];
        for (int i = 0; i < n; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target]==target;

    }
}
// @lc code=end
