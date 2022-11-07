import java.util.Stack;

/*
 * @Date: 2022-10-06 19:26:44
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-10-06 19:32:55
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=1078 lang=java
 *
 * [1078] Bigram 分词
 */

// @lc code=start
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        Stack<String> stack = new Stack<>();
        for (int i = words.length - 1; i > 1; i--) {
            if (words[i - 1].equals(second) && words[i - 2].equals(first)) {
                stack.push(words[i]);
            }
        }
        String[] res = new String[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}
// @lc code=end
