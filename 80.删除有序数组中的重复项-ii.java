/*
 * @Date: 2022-12-07 21:52:53
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-07 22:21:15
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除有序数组中的重复项 II
 */

/*
 * 检查上上个应该被保留的元素 nums[slow−2] 是否和当前待检查元素 nums[fast] 相同
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int slow = 2;
        int fast = 2;
        while (fast < nums.length) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
// @lc code=end
