import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * @Date: 2022-07-29 11:50:59
 * @LastEditTime: 2022-07-29 14:14:57
 * @FilePath: \LeetCode\350.两个数组的交集-ii.java
 */
/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        List<Integer> list = new LinkedList<>();
        Map<Integer, Integer> set = new HashMap<>();
        for (int num : nums1) {
            if (set.containsKey(num)) {
                set.put(num, set.get(num) + 1);
            } else {
                set.put(num, 1);
            }
        }
        for (int num : nums2) {
            if (set.containsKey(num) && set.get(num) != 0) {
                list.add(num);
                set.put(num, set.get(num) - 1);
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for (int i : list) {
            res[index++] = i;
        }
        return res;
    }
}
// @lc code=end
