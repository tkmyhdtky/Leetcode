/*
 * @Author: wangzhao wangzhao@swu.com
 * @Date: 2022-08-18 16:04:53
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-08-18 16:30:00
 * @FilePath: \Leetcode\415.字符串相加.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = (i >= 0 ? num1.charAt(i) - '0' : 0);
            int y = (j >= 0 ? num2.charAt(j) - '0' : 0);
            int res = x + y + add;
            ans.append(res % 10);
            add = res / 10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}
// @lc code=end
