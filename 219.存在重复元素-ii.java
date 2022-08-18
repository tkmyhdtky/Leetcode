import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @Date: 2022-07-30 10:39:42
 * @LastEditTime: 2022-07-30 11:14:11
 * @FilePath: \Leetcode\219.存在重复元素-ii.java
 */
/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    /**
     * @description: 哈希表
     * @param {int[]} nums
     * @param {int} k
     * @return {*}
     */
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     Map<Integer, Integer> map = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         if (map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) {
    //             return true;
    //         }
    //         map.put(nums[i], i);
    //     }
    //     return false;
    // }
    /**
     * @description: 滑动窗口
     * @param {int[]} nums
     * @param {int} k
     * @return {*}
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet<>();
        //i是窗口的右边界，左边界是max{0,i-k}
        for (int i = 0; i < nums.length; i++) {
            if (i>k) {
                //移除左边界前元素
                set.remove(nums[i-k-1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
