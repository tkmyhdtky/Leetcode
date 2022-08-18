/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-09 22:28:02
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-09 22:44:36
 * @FilePath: \LeetCode\26.删除有序数组中的重复项.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int slow = 0;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                if (fast - slow > 1) {
                    nums[slow + 1] = nums[fast];
                }
                slow++;
            }
            fast++;
        }
        return slow + 1;
    }
}
// @lc code=end
