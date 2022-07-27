/*
 * @Date: 2022-07-26 19:42:17
 * @LastEditTime: 2022-07-26 19:54:14
 * @FilePath: \LeetCode\209.长度最小的子数组.java
 */
/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int sum=0;
        int result=Integer.MAX_VALUE;
        for (; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right-left+1);
                sum-=nums[left++];
            }
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}
// @lc code=end
