
/*
 * @Date: 2022-09-18 15:35:07
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-18 15:42:25
 * @Description: Default
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
// class Solution {
//     List<List<Integer>> result = new ArrayList<>();
//     LinkedList<Integer> path = new LinkedList<>();

//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         backtracking(candidates, target, 0, 0);
//         return result;
//     }

//     private void backtracking(int[] candidates, int target, int index, int sum) {
//         if (sum > target) {
//             return;
//         }
//         if (sum == target) {
//             result.add(new ArrayList<>(path));
//             return;
//         }
//         for (int i = index; i < candidates.length; i++) {
//             sum += candidates[i];
//             path.add(candidates[i]);
//             backtracking(candidates, target, i, sum);
//             path.removeLast();
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
