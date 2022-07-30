import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 *
 * https://leetcode.cn/problems/subsets/description/
 *
 * algorithms
 * Medium (80.60%)
 * Likes:    1691
 * Dislikes: 0
 * Total Accepted:    469.1K
 * Total Submissions: 582.1K
 * Testcase Example:  '[1,2,3]'
 *
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
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
 * nums 中的所有元素 互不相同
 * 
 * 
 */

// @lc code=start
class Solution {
    List<List<Integer>> result=new ArrayList<>();
    LinkedList<Integer> list=new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtracking(nums, 0);
        return result;
    }
    private void backtracking(int[] nums,int startIdex) {
        result.add(new ArrayList<>(list));
        if (startIdex>=nums.length) {
            return;
        }
        for (int i = startIdex; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(nums, i+1);
            list.removeLast();
        }
    }
}
// @lc code=end

