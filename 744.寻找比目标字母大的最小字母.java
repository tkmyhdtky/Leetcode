/*
 * @Date: 2022-12-26 19:26:55
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-26 19:38:02
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int length = letters.length;
        if (target >= letters[length - 1]) {
            return letters[0];
        }
        int low = 0, high = length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (letters[mid]>target) {
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return letters[low];
    }
}
// @lc code=end
