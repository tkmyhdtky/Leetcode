import java.util.Stack;

/*
 * @Date: 2022-09-29 10:49:25
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-29 11:18:08
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=445 lang=java
 *
 * [445] 两数相加 II
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        int carry = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            int sum = 0;
            int x = s1.isEmpty() ? 0 : s1.pop();
            int y = s2.isEmpty() ? 0 : s2.pop();
            sum = x + y + carry;
            carry = sum / 10;
            ListNode cur = new ListNode(sum % 10);
            cur.next = head;
            head = cur;
        }
        if (carry != 0) {
            ListNode cur = new ListNode(carry);
            cur.next = head;
            head = cur;
        }
        return head;
    }
}
// @lc code=end
