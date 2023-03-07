import java.util.ArrayList;
import java.util.Arrays;
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
// class Solution {
//     List<List<Integer>> result = new ArrayList<>();
//     LinkedList<Integer> path = new LinkedList<>();

//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         Arrays.sort(candidates);
//         boolean[] used = new boolean[candidates.length];
//         backtracking(candidates, target, 0, 0, used);
//         return result;
//     }

//     private void backtracking(int[] candidates, int target, int startIndex, int sum, boolean[] used) {
//         if (sum > target) {
//             return;
//         }
//         if (sum == target) {
//             result.add(new ArrayList<>(path));
//             return;
//         }
//         for (int i = startIndex; i < candidates.length; i++) {
//             if (i > 0 && candidates[i] == candidates[i - 1] && !used[i - 1]) {
//                 continue;
//             }
//             sum += candidates[i];
//             used[i] = true;
//             path.add(candidates[i]);
//             backtracking(candidates, target, i + 1, sum, used);
//             path.removeLast();
//             used[i] = false;
//             sum -= candidates[i];
//         }
//     }
// }

/*
 * 2023年2月27日，第二次练习
 */
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates, target, 0, 0);
        return result;
    }

    private void backtracking(int[] candidates, int target, int sum, int startIndex) {
        // if (sum > target) {
        //     return;
        // }
        if (sum == target) {
            result.add(new ArrayList<>(path));
        }
        /*
         * [8,7,4,3] 11
         */
        // 减枝操作，当 sum + candidates[i] > target 时，无需进行下一次递归,但是这样去重需要先对数组进行排序，避免后面的小数未被遍历就忽略
        for (int i = startIndex; i < candidates.length && sum + candidates[i] <= target; i++) {

            path.add(candidates[i]);
            sum += candidates[i];
            // 数字可以无限制重复被选取,仍然从 i 开始
            backtracking(candidates, target, sum, i);
            sum -= candidates[i];
            path.removeLast();
        }
    }
}
// @lc code=end
