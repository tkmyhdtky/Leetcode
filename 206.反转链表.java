import java.util.List;

/*
 * @Date: 2022-07-28 15:10:12
 * @LastEditTime: 2022-07-28 15:32:24
 * @FilePath: \LeetCode\206.反转链表.java
 */
/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
     * @description: 双指针法
     * @return {*}
     */
    // public ListNode reverseList(ListNode head) {
    // ListNode pre = null;
    // ListNode cur = head;
    // ListNode temp=new ListNode();
    // while (cur != null) {
    // temp = cur.next;
    // cur.next=pre;
    // pre = cur;
    // cur=temp;
    // }
    // return pre;
    // }
    /**
     * @description: 递归法
     * @param {ListNode} head
     * @return {*}
     */
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode pre, ListNode cur) {
        if (cur == null) {
            return pre;
        }
        ListNode temp = cur.next;
        cur.next = pre;
        return reverse(cur, temp);
    }
}
// @lc code=end
