
/*
 * @Date: 2022-11-07 22:08:58
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-11-07 22:46:34
 * @Description: Default
 */
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length()!=str.length) {
            return false;
        }
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char x = pattern.charAt(i);
            String y = str[i];
            if ((map1.containsKey(x) && !map1.get(x).equals(y)) || (map2.containsKey(y) && !map2.get(y).equals(x))) {
                return false;
            }
            map1.put(x, y);
            map2.put(y, x);
        }
        return true;
    }
}
// @lc code=end
