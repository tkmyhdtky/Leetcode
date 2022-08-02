import java.util.ArrayList;
import java.util.List;

/*
 * @Date: 2022-08-02 20:14:09
 * @LastEditTime: 2022-08-02 20:51:38
 * @FilePath: \LeetCode\448.找到所有数组中消失的数字.java
 */
/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i + 1) {
                continue;
            } else {
                int num = nums[i];
                if (num != nums[num - 1]) {
                    int temp = nums[num - 1];
                    nums[i] = temp;
                    nums[num - 1] = num;
                    i--;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
// @lc code=end
