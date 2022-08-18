/*
 * @Date: 2022-08-02 19:26:43
 * @LastEditTime: 2022-08-02 20:02:20
 * @FilePath: \LeetCode\88.合并两个有序数组.java
 */
/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        m--;
        n--;
        while (n >= 0 && m >= 0) {
            if (nums1[m] >= nums2[n]) {
                nums1[i--] = nums1[m--];
            } else {
                nums1[i--] = nums2[n--];
            }
        }
        while (m >= 0) {
            nums1[i--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[i--] = nums2[n--];
        }
    }
}
// @lc code=end
