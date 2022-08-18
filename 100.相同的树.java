import java.util.Stack;

/*
 * @Date: 2022-08-05 10:21:58
 * @LastEditTime: 2022-08-05 13:57:13
 * @FilePath: \LeetCode\100.相同的树.java
 */
/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return compare(p, q);
    }

    /*
     * 递归法
     */
    private boolean compare(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }
        return compare(p.left, q.left) && compare(p.right, q.right);
    }

    /*
     * 迭代法
     */
    // private boolean compare(TreeNode p, TreeNode q) {
    //     Stack<TreeNode> stack = new Stack<>();
    //     stack.push(p);
    //     stack.push(q);
    //     while (!stack.isEmpty()) {
    //         TreeNode node1 = stack.pop();
    //         TreeNode node2 = stack.pop();
    //         if (node1 == null && node2 == null) {
    //             continue;
    //         }
    //         if (node1 == null || node2 == null || (node1.val != node2.val)) {
    //             return false;
    //         }
    //         stack.push(node1.left);
    //         stack.push(node2.left);
    //         stack.push(node1.right);
    //         stack.push(node2.right);
    //     }
    //     return true;
    // }

    // public class TreeNode {
    // int val;
    // TreeNode left;
    // TreeNode right;

    // TreeNode() {
    // }

    // TreeNode(int val) {
    // this.val = val;
    // }

    // TreeNode(int val, TreeNode left, TreeNode right) {
    // this.val = val;
    // this.left = left;
    // this.right = right;
    // }
    // }
}
// @lc code=end
