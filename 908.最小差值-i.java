/*
 * @Date: 2022-09-30 18:09:46
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-30 18:21:46
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=908 lang=java
 *
 * [908] 最小差值 I
 */

// @lc code=start
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        // if (k == 0) {
        //     return 0;
        // }
        int big = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            big = nums[i] > big ? nums[i] : big;
            small = nums[i] < small ? nums[i] : small;
        }
        if ((big - small) > (2 * k)) {
            return big - k - (small + k);
        } else {
            return 0;
        }
    }
}
// @lc code=end
