/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-06-28 18:59:49
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-06-28 19:07:52
 * @FilePath: \LeetCode\46.全排列.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 *
 * https://leetcode.cn/problems/permutations/description/
 *
 * algorithms
 * Medium (78.61%)
 * Likes:    2088
 * Dislikes: 0
 * Total Accepted:    650.1K
 * Total Submissions: 826.9K
 * Testcase Example:  '[1,2,3]'
 *
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,2,3]
 * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [0,1]
 * 输出：[[0,1],[1,0]]
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：nums = [1]
 * 输出：[[1]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 * 
 * 
 */

// @lc code=start
class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used=new boolean[nums.length];
        backtracking(nums, used);
        return res;
    }
    private void backtracking(int[] nums , boolean[] used) {
        if (list.size()==nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]==true) {
                continue;
            }
            list.add(nums[i]);
            used[i]=true;
            backtracking(nums, used);
            used[i]=false;
            list.remove(list.size()-1);
        }
    }
}
// @lc code=end

