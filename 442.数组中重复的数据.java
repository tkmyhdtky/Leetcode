
/*
 * @Date: 2022-07-26 21:59:37
 * @LastEditTime: 2022-07-26 22:47:32
 * @FilePath: \Leetcode\442.数组中重复的数据.java
 */
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=442 lang=java
 *
 * [442] 数组中重复的数据
 */

// @lc code=start
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            if (num < 0 || num - 1 == i) {
                continue;
            }
            if (num == nums[num - 1]) {
                ans.add(nums[num - 1]);
                nums[num - 1] *= -1;
            } else {
                int temp = nums[num - 1];
                nums[num - 1] = nums[i];
                nums[i--] = temp;
            }
        }
        return ans;
    }
}
// @lc code=end
