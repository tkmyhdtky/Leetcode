import java.util.HashMap;
import java.util.Map;

/*
 * @Date: 2022-08-02 20:03:26
 * @LastEditTime: 2022-08-02 20:10:59
 * @FilePath: \LeetCode\169.多数元素.java
 */
/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > n) {
                return nums[i];
            }
        }
        return -1;
    }
}
// @lc code=end
