import java.util.HashMap;
import java.util.Map;

/*
 * @Date: 2022-11-07 21:23:30
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-11-07 21:51:24
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    /**
     * 维护两个哈希表，相互对照检查
     * 
     * @param s
     * @param t
     * @return
     */
    // public boolean isIsomorphic(String s, String t) {
    // Map<Character, Character> s2t = new HashMap<>();
    // Map<Character, Character> t2s = new HashMap<>();

    // for (int i = 0; i < s.length(); i++) {
    // char x = s.charAt(i), y = t.charAt(i);
    // if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) &&
    // t2s.get(y) != x)) {
    // return false;
    // }
    // s2t.put(x, y);
    // t2s.put(y, x);
    // }
    // return true;
    // }

    /**
     * 比较最前索引，取当前位置字符第一次出现的索引对比
        情况1(一个字符映射多个): foo 与 bar, 处理第二个o时发现索引不同
        情况2(多个字符映射同个): abc 与 ggl, 处理第二个g时发现索引不同
     * @param s
     * @param t
     * @return
     */
    public boolean isIsomorphic(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
