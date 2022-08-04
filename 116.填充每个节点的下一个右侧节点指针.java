import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @Date: 2022-08-04 17:14:30
 * @LastEditTime: 2022-08-04 17:27:43
 * @FilePath: \LeetCode\116.填充每个节点的下一个右侧节点指针.java
 */
/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node p = root;
        level(p);
        return root;
    }

    private void level(Node root) {
        Deque<Node> deque = new ArrayDeque<>();
        if (root != null)
            deque.offer(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            Node pre = null;
            while (len > 0) {
                Node cur = deque.poll();
                cur.next = pre;
                if (cur.right != null)
                    deque.offer(cur.right);
                if (cur.left != null)
                    deque.offer(cur.left);
                pre = cur;
                len--;
            }
        }
    }
}
// @lc code=end
