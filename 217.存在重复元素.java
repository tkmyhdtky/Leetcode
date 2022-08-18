import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @Date: 2022-07-30 10:17:57
 * @LastEditTime: 2022-07-30 10:31:46
 * @FilePath: \Leetcode\217.存在重复元素.java
 */
/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    /**
     * @description: 先排序，比较相邻的两个数
     * @param {int[]} nums
     * @return {*}
     */
    // public boolean containsDuplicate(int[] nums) {
    // Arrays.sort(nums);
    // int slow = 0;
    // int fast = 1;
    // while (fast < nums.length) {
    // if (nums[slow++]==nums[fast++]) {
    // return true;
    // }
    // }
    // return false;
    // }
    /**
     * @description: 使用map方法
     * @param {int[]} nums
     * @return {*}
     */
    // public boolean containsDuplicate(int[] nums) {
    //     Map<Integer, Integer> record = new HashMap<>();
    //     for (int i = 0; i < nums.length; i++) {
    //         record.put(nums[i], 1 + record.getOrDefault(nums[i], 0));
    //     }
    //     if (record.size() != nums.length)
    //         return true;
    //     return false;
    // }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end
