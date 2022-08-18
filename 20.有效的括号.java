import java.util.Stack;

/*
 * @Date: 2022-08-03 10:52:01
 * @LastEditTime: 2022-08-03 11:02:17
 * @FilePath: \LeetCode\20.有效的括号.java
 */
/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
                continue;
            } else if (c == '[') {
                stack.push(']');
                continue;
            } else if (c == '{') {
                stack.push('}');
                continue;
            } else if (stack.isEmpty() || c != stack.peek()) {
                return false;
            } else {
                stack.pop();
            }

        }
        return stack.isEmpty();
    }
}
// @lc code=end
