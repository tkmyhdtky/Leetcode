
/*
 * @Date: 2022-12-29 14:26:36
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-12-29 14:59:06
 * @Description: Default
 */
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=953 lang=java
 *
 * [953] 验证外星语词典
 */

// @lc code=start
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for (int i = 1; i < words.length; i++) {
            String pre = words[i - 1];
            String cur = words[i];
            boolean res = false;
            for (int j = 0; j < Math.min(pre.length(), cur.length()); j++) {
                if (map.get(pre.charAt(j)) < map.get(cur.charAt(j))) {
                    res = true;
                    break;
                }else if(map.get(pre.charAt(j)) > map.get(cur.charAt(j))){
                    return false;
                }
            }
            //前面部分相等，判断长度，如 app 和 apple
            if (!res && pre.length()>cur.length()) {
                return false;
            }
        }
        return true;
    }

}
// @lc code=end
