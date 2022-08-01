import java.util.TreeSet;

/*
 * @Date: 2022-08-01 17:00:04
 * @LastEditTime: 2022-08-01 17:37:24
 * @FilePath: \LeetCode\414.第三大的数.java
 */
/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size()>3) {
                set.remove(set.first());
            }
        }
        return set.size()==3?set.first():set.last();
    }
}
// @lc code=end
