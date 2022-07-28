
/*
 * @Date: 2022-07-26 22:56:22
 * @LastEditTime: 2022-07-27 21:22:45
 * @FilePath: \Leetcode\74.搜索二维矩阵.java
 */
/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //把每一列拼接起来，作为一个一维数组考虑
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = m * n - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int x = matrix[mid / n][mid % n];
            if (x < target) {
                low = mid + 1;
            } else if (x > target) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;

    }
}
// @lc code=end
