
/*
 * @Date: 2022-07-31 09:17:48
 * @LastEditTime: 2022-07-31 09:31:13
 * @FilePath: \Leetcode\454.四数相加-ii.java
 */
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map = new HashMap<>();
        // 统计两个数组中的元素之和，同时统计出现的次数，放入map
        for (int i : nums1) {
            for (int j : nums2) {
                int temp = i + j;
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                }else{
                    map.put(temp, 1);
                }
            }
        }
        // 统计剩余的两个元素的和，在map中找是否存在相加为0的情况，同时记录次数
        int count = 0;
        for (int i : nums3) {
            for (int j : nums4) {
                int temp = i + j;
                if (map.containsKey(0 - temp)) {
                    count += map.get(0 - temp);
                }
            }
        }
        return count;
    }
}
// @lc code=end
