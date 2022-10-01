import java.util.Arrays;

/*
 * @Date: 2022-09-29 22:39:00
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-29 23:42:17
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=725 lang=java
 *
 * [725] 分隔链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int len = 0;
        ListNode cur = head, last = null;

        // 遍历链表
        while (cur != null) {
            len++;
            cur = cur.next;
        }

        // 计算数组每一项元素个数
        int each = len / k;
        ListNode[] result = new ListNode[k];
        Arrays.fill(result, null);
        int index = 0;
        int remain = len % k;
        cur = head;
        while (cur != null) {
            result[index++] = cur;
            for (int i = 0; i < (index <= remain ? each + 1 : each); i++) {
                last = cur;
                cur = cur.next;
            }
            last.next = null;

        }
        return result;
    }
}
// @lc code=end
