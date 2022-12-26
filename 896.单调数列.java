/*
 * @Date: 2022-12-16 18:21:47
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-17 18:29:53
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */


// @lc code=start
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                // 不是递增
                inc = false;
            } else if (nums[i] < nums[i + 1]) {
                // 不是递减
                dec = false;
            }

        }
        return inc || dec;
    }
}
// @lc code=end
