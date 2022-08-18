
/*
 * @Date: 2022-07-25 22:01:35
 * @LastEditTime: 2022-07-25 22:14:28
 * @FilePath: \Leetcode\977.有序数组的平方.java
 */
/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int[nums.length];
        int pos=nums.length-1;
        int l=0;
        int r=nums.length-1;
        while (l<=r) {
            if (nums[l]*nums[l]>=nums[r]*nums[r]) {
                res[pos--]=nums[l]*nums[l];
                l++;
            }else{
                res[pos--]=nums[r]*nums[r];
                r--;
            }
        }
        return res;
    }
}
// @lc code=end

