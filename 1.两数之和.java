
/*
 * @Date: 2022-07-31 09:06:28
 * @LastEditTime: 2022-07-31 09:15:37
 * @FilePath: \Leetcode\1.两数之和.java
 */
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                result[0] = map.get(temp);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }

        }
        return result;
    }
}
// @lc code=end
