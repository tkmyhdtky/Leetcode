/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    /**
     * @description: 使用栈
     * @param {String} s
     * @return {*}
     */
    // public String removeDuplicates(String s) {
    // Stack<Character> stack = new Stack<>();
    // for (char c : s.toCharArray()) {
    // if (stack.isEmpty() || c != stack.peek()) {
    // stack.push(c);
    // } else {
    // stack.pop();
    // }
    // }
    // String res = "";
    // while (!stack.isEmpty()) {
    // res = stack.pop() + res;
    // }
    // return res;
    // }
    /**
     * @description: 双指针
     * @param {String} s
     * @return {*}
     */
    public String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        int slow = 0;
        int fast = 0;
        while (fast < ch.length) {
            ch[slow] = ch[fast];
            if (slow > 0 && ch[slow] == ch[slow - 1]) {
                slow--;
            }else{
                slow++;
            }
            fast++;
        }
        return new String(ch,0,slow);
    }
}
// @lc code=end
