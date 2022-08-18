/*
 * @Date: 2022-07-31 10:46:40
 * @LastEditTime: 2022-07-31 10:51:30
 * @FilePath: \Leetcode\344.反转字符串.java
 */
/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            //位运算交换
            // s[left]^=s[right];
            // s[right]^=s[left];
            // s[left]^=s[right];
            right--;
            left++;
        }
    }
}
// @lc code=end
