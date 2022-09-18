
/*
 * @Date: 2022-09-18 15:35:07
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-18 15:42:25
 * @Description: Default
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, target, 0, 0);
        return result;
    }

    private void backtracking(int[] candidates, int target, int index, int sum) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, i, sum);
            path.removeLast();
            sum -= candidates[i];
        }
    }
}
// @lc code=end
