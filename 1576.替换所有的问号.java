/*
 * @Date: 2022-07-31 20:40:52
 * @LastEditTime: 2022-07-31 20:58:28
 * @FilePath: \Leetcode\1576.替换所有的问号.java
 */
/*
 * @lc app=leetcode.cn id=1576 lang=java
 *
 * [1576] 替换所有的问号
 */

// @lc code=start
class Solution {
    public String modifyString(String s) {
        char[] ch = s.toCharArray();
        if (ch.length==1&&ch[0]=='?') {
            ch[0]='a';
            return new String(ch);
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '?') {
                ch[i] = 'a';
                if (i == 0) {
                    while (ch[i] == ch[i + 1]) {
                        ch[i]++;
                    }
                } else if (i == ch.length - 1) {
                    while (ch[i] == ch[i - 1]) {
                        ch[i]++;
                    }
                } else {
                    while (ch[i - 1] == ch[i] || ch[i + 1] == ch[i]) {
                        ch[i]++;
                    }
                }
            }
        }
        return new String(ch);
    }
}
// @lc code=end
