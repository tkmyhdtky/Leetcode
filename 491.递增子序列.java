
/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-06-28 08:48:13
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-06-28 18:59:59
 * @FilePath: \LeetCode\491.递增子序列.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode.cn id=491 lang=java
 *
 * [491] 递增子序列
 *
 * https://leetcode.cn/problems/increasing-subsequences/description/
 *
 * algorithms
 * Medium (52.91%)
 * Likes:    462
 * Dislikes: 0
 * Total Accepted:    84.6K
 * Total Submissions: 159.8K
 * Testcase Example:  '[4,6,7,7]'
 *
 * 给你一个整数数组 nums ，找出并返回所有该数组中不同的递增子序列，递增子序列中 至少有两个元素 。你可以按 任意顺序 返回答案。
 * 
 * 数组中可能含有重复元素，如出现两个整数相等，也可以视作递增序列的一种特殊情况。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [4,6,7,7]
 * 输出：[[4,6],[4,6,7],[4,6,7,7],[4,7],[4,7,7],[6,7],[6,7,7],[7,7]]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：nums = [4,4,3,2,1]
 * 输出：[[4,4]]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= nums.length <= 15
 * -100 <= nums[i] <= 100
 * 
 * 
 */

// @lc code=start
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);
        return res;
    }

    private void backtracking(int[] nums, int startIndex) {
        HashSet<Integer> used = new HashSet<>();
        if (list.size() > 1) {
            res.add(new ArrayList<>(list));
        }
        // int[] used = new int[201];
        for (int i = startIndex; i < nums.length; i++) {
            if (!list.isEmpty() && nums[i] < list.get(list.size() - 1) ||
                    (used.contains(nums[i])))
                continue;
            used.add(nums[i]);
            list.add(nums[i]);
            backtracking(nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
// @lc code=end
