
/*
 * @Date: 2022-08-01 17:44:30
 * @LastEditTime: 2022-08-01 17:58:20
 * @FilePath: \LeetCode\136.只出现一次的数字.java
 */
/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    // public int singleNumber(int[] nums) {
    // Set<Integer> set=new HashSet<>();
    // for (int num : nums) {
    // if (set.contains(num)) {
    // set.remove(num);
    // }else{
    // set.add(num);
    // }
    // }
    // for (Integer integer : set) {
    // return integer;
    // }
    // return 0;
    // }
    /**
     * @description: 位运算
     * @param {int[]} nums
     * @return {*}
     */
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
// @lc code=end
