import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
 * @Date: 2022-08-04 17:09:41
 * @LastEditTime: 2022-08-04 17:13:53
 * @FilePath: \LeetCode\515.在每个树行中找最大值.java
 */
/*
 * @lc app=leetcode.cn id=515 lang=java
 *
 * [515] 在每个树行中找最大值
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        level(root, list);
        return list;
    }

    private void level(TreeNode root, List<Integer> list) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        if (root != null)
            deque.offer(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            int max = Integer.MIN_VALUE;
            while (len > 0) {
                TreeNode cur = deque.poll();
                max = max > cur.val ? max : cur.val;
                if (cur.left != null)
                    deque.offer(cur.left);
                if (cur.right != null)
                    deque.offer(cur.right);
                len--;
            }
            list.add(max);
        }
    }
}
// @lc code=end
