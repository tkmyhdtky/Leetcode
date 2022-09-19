
/*
 * @Author: WangZhao wz1847584786@163.com
 * @Date: 2022-06-26 15:28:04
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-19 14:21:38
 * @FilePath: \LeetCode\93.复原-ip-地址.java
 * @Description: 
 * 
 * Copyright (c) 2022 by WangZhao wz1847584786@163.com, All Rights Reserved. 
 */
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.ReverbType;

/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原 IP 地址
 *
 * https://leetcode.cn/problems/restore-ip-addresses/description/
 *
 * algorithms
 * Medium (56.64%)
 * Likes:    942
 * Dislikes: 0
 * Total Accepted:    239.4K
 * Total Submissions: 422.7K
 * Testcase Example:  '"25525511135"'
 *
 * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
 * 
 * 
 * 例如："0.1.2.201" 和 "192.168.1.1" 是 有效 IP 地址，但是 "0.011.255.245"、"192.168.1.312"
 * 和 "192.168@1.1" 是 无效 IP 地址。
 * 
 * 
 * 给定一个只包含数字的字符串 s ，用以表示一个 IP 地址，返回所有可能的有效 IP 地址，这些地址可以通过在 s 中插入 '.' 来形成。你 不能
 * 重新排序或删除 s 中的任何数字。你可以按 任何 顺序返回答案。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 
 * 输入：s = "25525511135"
 * 输出：["255.255.11.135","255.255.111.35"]
 * 
 * 
 * 示例 2：
 * 
 * 
 * 输入：s = "0000"
 * 输出：["0.0.0.0"]
 * 
 * 
 * 示例 3：
 * 
 * 
 * 输入：s = "101023"
 * 输出：["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= s.length <= 20
 * s 仅由数字组成
 * 
 * 
 */

// @lc code=start
class Solution {
    List<String> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {

        if (s.length() > 12) {
            return res;
        }
        backtracking(s, 0, 0);
        return res;
    }

    /**
     * @description:
     * @param {String} s 给定的字符串
     * @param {int}    startIndex 记录下一层递归的位置
     * @param {int}    pointNum 添加"."的数量
     * @return {*}
     */
    private void backtracking(String s, int startIndex, int pointNum) {
        if (pointNum == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                res.add(s);
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                backtracking(s, i + 2, pointNum+1);
                s = s.substring(0, i + 1) + s.substring(i + 2);
            } else {
                break;
            }
        }
    }

    public boolean isValid(String s, int start, int end) {
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        // 检测非数字字符
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) > '9' || s.charAt(i) < '0') {
                return false;
            }
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
