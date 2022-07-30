/*
 * @Date: 2022-07-29 11:58:09
 * @LastEditTime: 2022-07-29 13:54:19
 * @FilePath: \LeetCode\349.两个数组的交集.java
 */
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        int[] res=new int[set2.size()];
        int index=0;
        for (int i : set2) {
            res[index++]=i;
        }
        return res;
    }
}
// @lc code=end

