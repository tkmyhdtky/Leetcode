/*
 * @Date: 2022-08-05 09:03:48
 * @LastEditTime: 2022-08-05 09:07:25
 * @FilePath: \LeetCode\167.两数之和-ii-输入有序数组.java
 */
/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}
// @lc code=end
