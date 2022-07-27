
/*
 * @Date: 2022-07-27 21:23:19
 * @LastEditTime: 2022-07-27 22:19:46
 * @FilePath: \Leetcode\59.螺旋矩阵-ii.java
 */
/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        // 循环的次数
        int loop = 0;
        // 每次循环开始的位置(start,start)
        int start = 0;
        // 数字
        int num = 1;
        int i, j;
        while (loop++ < n / 2) {
            for (j = start; j < n - loop; j++)
                result[start][j] = num++;
            for (i = start; i < n - loop; i++)
                result[i][j] = num++;
            for (; j >= loop; j--)
                result[i][j] = num++;
            for (; i >= loop; i--)
                result[i][j] = num++;
            start++;
        }
        if (n % 2 == 1)
            result[start][start] = num;
        return result;
    }
}

// @lc code=end
