/*
 * @Date: 2022-08-01 15:23:15
 * @LastEditTime: 2022-08-01 16:12:21
 * @FilePath: \LeetCode\67.二进制求和.java
 */
/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

//计算 当前位 = (运算数运算 + 进位) % 进制
//计算 进位 =  (运算数运算 + 进位) / 进制

// @lc code=start
class Solution {
    // public String addBinary(String a, String b) {
    // int n = a.length();
    // int m = b.length();
    // // 补齐字符串
    // if (n >= m) {
    // String attach = "";
    // for (int i = 0; i < n - m; i++)
    // attach += "0";
    // b = attach + b;
    // m = n;
    // } else {
    // return addBinary(b, a);
    // }
    // int carry = 0;
    // StringBuilder sb = new StringBuilder();
    // for (int i = m - 1; i >= 0; i--) {
    // int ai = a.charAt(i) == '0' ? 0 : 1;
    // int bi = b.charAt(i) == '0' ? 0 : 1;
    // int cur = (ai + bi + carry) % 2; // 当前位
    // carry = (ai + bi + carry) / 2; // 进位
    // sb.append(cur);
    // }
    // if (carry == 1) {
    // sb.append(carry);
    // }
    // return sb.reverse().toString();
    // }
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1, n = b.length() - 1;
        int carry = 0;
        while (m >= 0 || n >= 0) {
            int ai = (m >= 0 ? a.charAt(m) - '0' : 0);
            int bi = (n >= 0 ? b.charAt(n) - '0' : 0);
            m--;
            n--;
            int cur = (ai + bi + carry) % 2; // 当前位
            carry = (ai + bi + carry) / 2; // 进位
            sb.append(cur);
        }
        if (carry == 1)
            sb.append(carry); // 最高位仍有进位时
        return sb.reverse().toString(); // 翻转
    }
}
// @lc code=end
