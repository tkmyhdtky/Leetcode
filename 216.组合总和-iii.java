
/*
 * @Date: 2022-09-12 14:21:57
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-12 14:28:27
 * @Description: Default;
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
// class Solution {
//     List<List<Integer>> result = new ArrayList<>();
//     LinkedList<Integer> path = new LinkedList<>();

//     public List<List<Integer>> combinationSum3(int k, int n) {
//         backtracking(k, n, 0, 1);
//         return result;
//     }

//     private void backtracking(int k, int n, int sum, int startIndex) {
//         if (sum > n) { // 剪枝操作
//             return;
//         }
//         if (path.size() == k) {
//             if (sum == n) {
//                 result.add(new ArrayList<>(path));
//             }
//             return;
//         }
//         for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
//             sum += i;
//             path.add(i);
//             backtracking(k, n, sum, i + 1);
//             path.removeLast();
//             sum -= i;
//         }
//     }
// }

/*
 * 2023年2月27日，第二次练习
 */
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracking(n, k, 0, 1);
        return result;
    }

    /**
     * @description: 回溯遍历寻找合适的组合
     * @param {int} n 组合目标和
     * @param {int} k 需要的数字个数，即递归的次数
     * @param {int} sum 遍历路径中数字的总和
     * @param {int} startIndex 从哪里开始遍历
     * @return {*}
     */
    private void backtracking(int n, int k, int sum, int startIndex) {
        // 减枝操作：sum>targetSum时，后序遍历无意义，直接返回
        if (sum > n) {
            return;
        }
        if (path.size() == k) {
            if (sum == n)
                result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            path.add(i);
            sum += i;
            backtracking(n, k, sum, i + 1);
            sum -= i;
            path.removeLast();
        }
    }
}
// @lc code=end
