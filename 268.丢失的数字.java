/*
 * @Date: 2022-08-01 16:44:07
 * @LastEditTime: 2022-08-01 17:18:12
 * @FilePath: \LeetCode\268.丢失的数字.java
 */
/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 丢失的数字
 */

// @lc code=start
class Solution {
    // public int missingNumber(int[] nums) {
    // Arrays.sort(nums);
    // if (nums[0] != 0)
    // return 0;
    // for (int i = 1; i < nums.length; i++) {
    // if (nums[i] == nums[i - 1] + 1) {
    // continue;
    // } else {
    // return i;
    // }
    // }
    // return nums.length;
    // }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
        }
        return total-sum;
    }
}
// @lc code=end
