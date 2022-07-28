import java.util.LinkedList;
import java.util.List;

/*
 * @Date: 2022-07-27 22:02:15
 * @LastEditTime: 2022-07-27 23:37:25
 * @FilePath: \Leetcode\54.螺旋矩阵.java
 */
/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        // 每次循环开始的位置(start,start)
        int start = 0;

        int rows = matrix.length;
        int columns = matrix[0].length;

        // 循环的次数
        int loop = 0;
        int i, j;
        while (loop++ < Math.min(rows, columns) / 2) {
            for (j = start; j < columns - loop; j++)
                list.add(matrix[start][j]);
            for (i = start; i < rows - loop; i++)
                list.add(matrix[i][j]);
            for (; j >= loop; j--) {
                list.add(matrix[i][j]);
            }
            for (; i >= loop; i--)
                list.add(matrix[i][j]);
            start++;
        }
        if (Math.min(rows, columns) % 2 == 1) {
            if (rows > columns) {
                for (i = start; i < rows - loop + 1; i++) {
                    list.add(matrix[i][start]);
                }
            } else {
                for (i = start; i < columns - loop + 1; i++) {
                    list.add(matrix[start][i]);
                }
            }
        }
        return list;
    }
}
// @lc code=end
