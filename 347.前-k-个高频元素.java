import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/*
 * @Date: 2022-08-03 14:34:43
 * @LastEditTime: 2022-08-03 14:45:15
 * @FilePath: \LeetCode\347.前-k-个高频元素.java
 */
/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1) {
            return nums;
        }
        int result[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        // 根据map的value值，构建于一个大顶堆
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                ((o1, o2) -> o2.getValue() - o1.getValue()));
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
        }
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }
}
// @lc code=end
