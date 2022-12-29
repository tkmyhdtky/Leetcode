import java.util.Arrays;

/*
 * @Date: 2022-12-26 22:48:52
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-26 22:58:50
 * @Description: Default
 */

/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length  - k];
    }
}
// @lc code=end
