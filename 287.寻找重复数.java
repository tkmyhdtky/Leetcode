
/*
 * @Date: 2022-12-07 21:33:01
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-07 21:51:11
 * @Description: Default
 */

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

/**
 * 1. 排序后比较
 * 2. 依次放入Set集合，查询重复放入
 * 3. 设置慢指针 slow 和快指针  fast ，慢指针每次走一步，快指针每次走两步，
 * 根据「Floyd 判圈算法」两个指针在有环的情况下一定会相遇，此时我们再将 slow 放置起点，
 * 两个指针每次同时移动一步，相遇的点就是答案
 */
// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int fast = nums[0];
        int slow = nums[0];
        do {
            fast = nums[nums[fast]];
            slow = nums[slow];
        } while (fast != slow);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
// @lc code=end
