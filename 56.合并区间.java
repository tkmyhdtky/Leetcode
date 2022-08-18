import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-07-04 18:34:27
 * @LastEditors: WangZhao wz1847584786@163.com
 * @LastEditTime: 2022-07-04 19:03:05
 * @FilePath: \LeetCode\56.合并区间.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 *
 * https://leetcode.cn/problems/merge-intervals/description/
 *
 * algorithms
 * Medium (48.75%)
 * Likes:    1541
 * Dislikes: 0
 * Total Accepted:    475.1K
 * Total Submissions: 973.7K
 * Testcase Example:  '[[1,3],[2,6],[8,10],[15,18]]'
 *
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi]
 * 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
 * 输出：[[1,6],[8,10],[15,18]]
 * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：intervals = [[1,4],[4,5]]
 * 输出：[[1,5]]
 * 解释：区间 [1,4] 和 [4,5] 可被视为重叠区间。
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new LinkedList<>();
        Arrays.sort(intervals, (o1, o2) -> Integer.compare(o1[0], o2[0]));
        int start = intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0]>intervals[i-1][1]) {
                res.add(new int[]{start,intervals[i-1][1]});
                start=intervals[i][0];
            }else{
                intervals[i][1]=Math.max(intervals[i][1], intervals[i-1][1]);
            }
        }
        res.add(new int[]{start,intervals[intervals.length-1][1]});
        return res.toArray(new int[res.size()][]);
    }
}
// @lc code=end
