
/*
 * @Date: 2022-08-04 17:04:47
 * @LastEditTime: 2022-08-04 17:08:49
 * @FilePath: \LeetCode\429.n-叉树的层序遍历.java
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N 叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        level(root, list);
        return list;
    }

    private void level(Node root, List<List<Integer>> list) {
        Deque<Node> deque = new ArrayDeque<>();
        if (root != null)
            deque.offer(root);
        while (!deque.isEmpty()) {
            List<Integer> res = new ArrayList<>();
            int len = deque.size();
            while (len > 0) {
                Node cur = deque.poll();
                res.add(cur.val);
                for (Node node : cur.children) {
                    deque.offer(node);
                }
                len--;
            }
            list.add(res);
        }
    }
}
// @lc code=end
