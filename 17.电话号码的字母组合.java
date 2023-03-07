import java.util.ArrayList;
import java.util.List;

/*
 * @Date: 2022-09-12 15:06:22
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-18 15:31:48
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
// class Solution {
//     List<String> result = new ArrayList<>();
//     StringBuilder temp = new StringBuilder();
//     String[] numString = { "", "", "abc",
//             "def", "ghi", "jkl",
//             "mno", "pqrs", "tuv", "wxyz" };

//     public List<String> letterCombinations(String digits) {
//         if (digits == null || digits.length() == 0) {
//             return result;
//         }
//         backtracking(digits, 0);
//         return result;
//     }

//     private void backtracking(String digits, int index) {
//         if (index == digits.length()) {
//             result.add(temp.toString());
//             return;
//         }
//         String str = numString[digits.charAt(index) - '0'];
//         for (int i = 0; i < str.length(); i++) {
//             temp.append(str.charAt(i));
//             backtracking(digits, index + 1);
//             temp.deleteCharAt(temp.length() - 1);
//         }
//     }
// }

/**
 * @description: 2023年3月7日，第二次练习
 * @return {*}
 */
class Solution {
    String[] str = { " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    List<String> res = new ArrayList<>();
    StringBuilder s = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return res;
        }
        backtracking(digits, 0);
        return res;

    }

    void backtracking(String digits, int index) {
        if (index == digits.length()) {
            res.add(s.toString());
            return;
        }
        // 隐形的类型转换
        int digit = digits.charAt(index) - '0';
        // 查看数字对应的字母
        String letters = str[digit];
        for (int i = 0; i < letters.length(); i++) {
            s.append(letters.charAt(i));
            backtracking(digits, index + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
}
// @lc code=end
