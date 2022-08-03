import java.util.Stack;

/*
 * @Date: 2022-08-03 11:33:16
 * @LastEditTime: 2022-08-03 11:58:38
 * @FilePath: \LeetCode\150.逆波兰表达式求值.java
 */
/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if ("+".equals(s)) { // leetcode 内置jdk的问题，不能使用==判断字符串是否相等
                stack.push(stack.pop() + stack.pop()); // 注意 - 和/ 需要特殊处理
            } else if ("-".equals(s)) {
                stack.push((-stack.pop()) + stack.pop());
            } else if ("*".equals(s)) {
                stack.push(stack.pop() * stack.pop());
            } else if ("/".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2 / temp1);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return Integer.valueOf(stack.pop());
    }
}
// @lc code=end
