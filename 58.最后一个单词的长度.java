/*
 * @Date: 2022-07-31 21:00:54
 * @LastEditTime: 2022-07-31 21:05:14
 * @FilePath: \Leetcode\58.最后一个单词的长度.java
 */
/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        int end = ch.length - 1;
        while (ch[end] == ' ') {
            end--;
        }
        int length=0;
        for (int i = end; i >=0; i--) {
            if (ch[i]!=' ') {
                length++;
            }else{
                return length;
            }
        }
        return length;
    }
}
// @lc code=end
