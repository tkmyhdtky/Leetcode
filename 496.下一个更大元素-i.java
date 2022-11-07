
/*
 * @Date: 2022-10-02 14:17:45
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-10-06 18:52:15
 * @Description: Default
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    // public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    // int m = nums1.length, n = nums2.length;
    // int[] res = new int[m];
    // for (int i = 0; i < m; ++i) {
    // int j = 0;
    // while (j < n && nums2[j] != nums1[i]) {
    // j++;
    // }
    // int k = j + 1;
    // while (k < n && nums2[k] < nums2[j]) {
    // k++;
    // }
    // res[i] = k < n ? nums2[k] : -1;
    // }
    // return res;
    // }

    /**
     * @description: 栈+哈希表
     * @return {*}
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && num >= stack.peek()) {
                stack.pop();
            }
            map.put(num, stack.empty() ? -1 : stack.peek());
            stack.push(num);
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
        return res;
    }
}

// @lc code=end
