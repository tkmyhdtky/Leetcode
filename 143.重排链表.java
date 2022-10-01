/*
 * @Date: 2022-09-29 09:51:34
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-29 10:10:52
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode cur = head.next;
        ListNode pre = head;
        while (cur.next != null) {
            pre.next = null;
            cur = reverse(cur);
            pre.next = cur;
            ListNode temp = cur.next;
            pre = cur;
            cur = temp;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = new ListNode();
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
// @lc code=end
