/*
 * @Date: 2022-07-28 19:01:57
<<<<<<< HEAD
 * @LastEditTime: 2022-07-30 17:36:11
 * @FilePath: \Leetcode\19.删除链表的倒数第-n-个结点.java
=======
 * @LastEditTime: 2022-07-28 19:09:39
 * @FilePath: \LeetCode\19.删除链表的倒数第-n-个结点.java
>>>>>>> 8ba09dc271a4c6064812761e2f7881f66d53b3bc
 */
/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy, fast = dummy;

        while (n-- > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
// @lc code=end
