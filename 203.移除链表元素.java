/*
 * @Date: 2022-07-28 11:45:54
 * @LastEditTime: 2022-07-28 13:51:15
 * @FilePath: \LeetCode\203.移除链表元素.java
 */
/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        //虚拟头结点
        ListNode dummy=new ListNode(-1,head);

        ListNode pre=dummy;
        ListNode cur=head;
        while (cur!=null) {
            if (cur.val==val) {
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}
// @lc code=end

