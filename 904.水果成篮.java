/*
 * @Date: 2022-07-26 19:54:30
 * @LastEditTime: 2022-07-26 20:30:17
 * @FilePath: \LeetCode\904.水果成篮.java
 */
/*
 * @lc app=leetcode.cn id=904 lang=java
 *
 * [904] 水果成篮
 */

// @lc code=start
class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length == 1 || fruits.length == 2) {
            return fruits.length;
        }
        int left = 0;
        int right = 0;
        int ln = fruits[0]; // 左边水果
        int rn = fruits[0]; // 右边水果
        int result = Integer.MIN_VALUE;
        
        for (; right < fruits.length; right++) {
            // 找到第三类应该直接把慢指针放到快指针的前一步，再慢慢回退找齐所有同类，这样才能保证连续。
            if (fruits[right] != rn && fruits[right] != ln) {
                left = right - 1; // 左边指针移到右指前一位
                while (left >= 1 && fruits[left - 1] == fruits[left]) {
                    // 确保左指针和前面不一致，一致需要左指针左移
                    left--;
                }
                ln = fruits[left];
                rn = fruits[right];
            }
            result = Math.max(result, right - left + 1);
        }
        return Math.max(2, result);
    }
}
// @lc code=end
