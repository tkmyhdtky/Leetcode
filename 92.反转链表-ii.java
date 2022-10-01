/*
 * @Date: 2022-09-29 00:16:55
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-29 00:56:55
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(-1, head);
        ListNode pre = dummyNode;
        // left前一个结点
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        // right结点
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        ListNode leftNode = pre.next;
        ListNode curr = rightNode.next;

        // 切断链接
        pre.next = null;
        rightNode.next = null;
        
        reverseLinkedList(leftNode);

        // 回到原来的链表中
        pre.next = rightNode;
        leftNode.next = curr;
        return dummyNode.next;


    }
    private void reverseLinkedList(ListNode head) {
        // 也可以使用递归反转一个链表
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

}
// @lc code=end
