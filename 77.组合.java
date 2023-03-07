import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
// class Solution {
//     List<List<Integer>> result = new ArrayList<>();
//     LinkedList<Integer> path = new LinkedList<>();

//     public List<List<Integer>> combine(int n, int k) {
//         backtracking(n, k, 1);
//         return result;
//     }

//     private void backtracking(int n, int k, int startIndex) {
//         if (path.size() == k) {
//             result.add(new ArrayList<>(path));
//             return;
//         }
//         for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
//             path.add(i);
//             backtracking(n, k, i + 1);
//             path.removeLast();
//         }
//     }
// }

/*
 * 2023-2-26，第二次练习
 */
class Solution {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;
    }

    /**
     * @description:
     * @param {int} n for 循环宽度
     * @param {int} k 递归深度
     * @param {int} startIndex 用于逐渐收缩范围
     * @return {*}
     */
    private void backtracking(int n, int k, int startIndex) {
        // 终止条件
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        /*
         * 减枝操作：如果循环开始之后的元素个数少于我们需要的元素个数，就没有必要搜索
         * k-size > n - i + 1 ====> i > n+size-k+1
         */
        for (int i = startIndex; i <= n - (k - temp.size()) + 1; i++) {
            temp.add(i);
            backtracking(n, k, i + 1);
            temp.removeLast();
        }
    }
}
// @lc code=end
