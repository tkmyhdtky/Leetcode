/*
 * @Date: 2022-07-28 20:59:54
 * @LastEditTime: 2022-07-30 09:52:05
 * @FilePath: \Leetcode\160.相交链表.java
 */
/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (curA != null) {
            lengthA++;
            curA = curA.next;
        }
        while (curB != null) {
            lengthB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        //默认是A>B,如果不是则交换A，B
        if (lengthB > lengthA) {
            int temp = lengthA;
            lengthA = lengthB;
            lengthB = temp;
            ListNode tempNode = curA;
            curA = curB;
            curB = tempNode;
        }
        int gap = lengthA - lengthB;
        while (gap-- > 0) {
            curA = curA.next;
        }
        // 遍历A和B
        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }

}
// @lc code=end
