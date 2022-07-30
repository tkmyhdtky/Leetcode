/*
 * @Date: 2022-07-29 14:26:33
 * @LastEditTime: 2022-07-29 15:54:19
 * @FilePath: \LeetCode\1122.数组的相对排序.java
 */
/*
 * @lc app=leetcode.cn id=1122 lang=java
 *
 * [1122] 数组的相对排序
 */

// @lc code=start
class Solution{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int slow = 0;
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            int fast = slow;
            for (; fast < arr1.length; fast++) {
                if (arr1[fast] == num) {
                    int temp = arr1[slow];
                    arr1[slow] = arr1[fast];
                    arr1[fast] = temp;
                    slow++;
                }
            }
        }
        //从slow开始排序arr1
        for (int i = slow; i < arr1.length; i++) {
            int min=i;
            for (int j = i; j < arr1.length; j++) {
                if (arr1[j]<arr1[min]) {
                    min=j;
                }
            }
            int temp=arr1[i];
            arr1[i]=arr1[min];
            arr1[min]=temp;
        }
        return arr1;
    }

}
// @lc code=end
