/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-09 22:45:10
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-09 22:49:58
 * @FilePath: \LeetCode\283.移动零.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
// @lc code=end
