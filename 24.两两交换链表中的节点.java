/*
 * @Date: 2022-07-28 15:33:55
 * @LastEditTime: 2022-07-28 18:56:12
 * @FilePath: \LeetCode\24.两两交换链表中的节点.java
 */
/*
 * @lc app=leetcode.cn id=24 lang=java
 *
 * [24] 两两交换链表中的节点
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
    /**
     * @description: 递归法
     * @param {ListNode} head
     * @return {*}
     */
    // public ListNode swapPairs(ListNode head) {
    // if (head == null || head.next == null)
    // return head;
    // ListNode next = head.next;
    // ListNode newNode=swapPairs(next.next);
    // next.next=head;
    // head.next=newNode;
    // return next;
    // }
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode temp1=cur.next;
            ListNode temp2=cur.next.next.next;
            cur.next=cur.next.next;
            cur.next.next=temp1;
            cur.next.next.next=temp2;
            cur=cur.next.next;
        }
        return dummy.next;
    }

    // public class ListNode {
    // int val;
    // ListNode next;

    // ListNode() {
    // }

    // ListNode(int val) {
    // this.val = val;
    // }

    // ListNode(int val, ListNode next) {
    // this.val = val;
    // this.next = next;
    // }
    // }
}
// @lc code=end
