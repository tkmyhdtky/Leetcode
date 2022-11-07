
/*
 * @Date: 2022-10-06 18:54:24
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-10-06 19:38:52
 * @Description: Default
 */
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=682 lang=java
 *
 * [682] 棒球比赛
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newTop = top + stack.peek();
                stack.push(top);
                stack.push(newTop);
            } else if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        int res = 0;
        for (Integer integer : stack) {
            res += integer;
        }
        return res;
    }
}
// @lc code=end
