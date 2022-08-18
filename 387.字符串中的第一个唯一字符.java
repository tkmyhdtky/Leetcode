import java.util.HashMap;
import java.util.Map;

/*
 * @Date: 2022-08-03 15:02:54
 * @LastEditTime: 2022-08-03 15:04:03
 * @FilePath: \LeetCode\387.字符串中的第一个唯一字符.java
 */
/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end
