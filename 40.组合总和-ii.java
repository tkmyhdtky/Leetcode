import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
 * @Date: 2022-09-18 16:05:11
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-18 16:35:49
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        boolean[] used = new boolean[candidates.length];
        backtracking(candidates, target, 0, 0, used);
        return result;
    }

    private void backtracking(int[] candidates, int target, int startIndex, int sum, boolean[] used) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
                continue;
            }
            sum += candidates[i];
            used[i] = true;
            path.add(candidates[i]);
            backtracking(candidates, target, i + 1, sum, used);
            path.removeLast();
            used[i] = false;
            sum -= candidates[i];
        }
    }
}
// @lc code=end
