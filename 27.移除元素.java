/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-09 22:15:02
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-09 22:25:39
 * @FilePath: \LeetCode\27.移除元素.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
// @lc code=end
