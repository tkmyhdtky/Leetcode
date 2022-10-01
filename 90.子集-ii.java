import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-06-26 16:29:30
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-22 08:46:57
 * @FilePath: \LeetCode\90.子集-ii.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 *
 * https://leetcode.cn/problems/subsets-ii/description/
 *
 * algorithms
 * Medium (63.59%)
 * Likes:    863
 * Dislikes: 0
 * Total Accepted:    214.2K
 * Total Submissions: 336.8K
 * Testcase Example:  '[1,2,2]'
 *
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * 
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [0]
 * 输出：[[],[0]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 
 * -10 
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length == 0) {
            result.add(list);
            return result;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtracking(nums, 0, used);
        return result;
    }

    private void backtracking(int[] nums, int startIdex, boolean[] used) {
        result.add(new ArrayList<>(list));
        for (int i = startIdex; i < nums.length; i++) {
            if (i > startIdex && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            backtracking(nums, i + 1, used);
            used[i] = false;
            list.removeLast();
        }
    }
}
// @lc code=end
