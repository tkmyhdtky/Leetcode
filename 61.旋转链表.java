/*
 * @Date: 2022-09-28 20:45:29
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-28 23:46:20
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }
        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        if ((k % len) == 0) {
            return temp;
        }
        while((k % len) > 0) {
            k--;
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode res = slow.next;
        fast.next = temp;
        slow.next = null;
        return res;
    }
}
// @lc code=end
