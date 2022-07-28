/*
 * @Date: 2022-07-15 17:43:28
 * @LastEditTime: 2022-07-28 20:42:28
 * @FilePath: \Leetcode\141.环形链表.java
 */
/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == null || head.next == null) {
            return false;
        }
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    // class ListNode {
    // int val;
    // ListNode next;

    // ListNode(int x) {
    // val = x;
    // next = null;
    // }
    // }
}
// @lc code=end
