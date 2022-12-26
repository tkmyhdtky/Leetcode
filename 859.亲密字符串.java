
/*
 * @Date: 2022-12-17 18:32:33
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-17 19:01:34
 * @Description: Default
 */

/*
 * @lc app=leetcode.cn id=859 lang=java
 *
 * [859] 亲密字符串
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            int[] map = new int[26];
            for (int i = 0; i < s.length(); i++) {
                map[s.charAt(i) - 'a']++;
                if (map[s.charAt(i) - 'a'] > 1) {
                    // 如果有大于1的，说明至少有一个字母使用了两次，可以进行交换
                    return true;
                }
            }
        } else {
            /*
             * 此时仅有两个字符不同
             */
            int first = -1, second = -1;
            for (int i = 0; i < goal.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i; // 找到其中一处不同的地方
                    } else if (second == -1) {
                        second = i; // 找到另一处不同的地方
                    } else {
                        // 超过两处位置不同
                        return false;
                    }
                }
            }
            return (second != -1 && s.charAt(first) == goal.charAt(second) &&
                    s.charAt(second) == goal.charAt(first));
        }
        return false;
    }
}
// @lc code=end
