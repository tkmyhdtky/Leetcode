import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * @Date: 2022-08-04 11:00:05
 * @LastEditTime: 2022-08-04 15:53:30
 * @FilePath: \LeetCode\94.二叉树的中序遍历.java
 */
/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    /**
     * @description: 递归中序遍历
     */
    // private void inOrder(TreeNode root, List<Integer> list) {
    // if (root == null) {
    // return;
    // }
    // inOrder(root.left, list);
    // list.add(root.val);
    // inOrder(root.right, list);
    // }
    /**
     * @description: 迭代中序遍历
     */
    // private void inOrder(TreeNode root, List<Integer> list) {
    // Stack<TreeNode> stack = new Stack<>();
    // TreeNode cur = root;
    // while (cur != null || !stack.isEmpty()) {
    // if (cur != null) { // 指针来访问节点，访问到最底层
    // stack.push(cur); // 将访问的节点放进栈
    // cur = cur.left;
    // } else {
    // cur = stack.pop();
    // list.add(cur.val);
    // cur = cur.right;
    // }
    // }
    // }
    /*
     * 统一风格代码标记法中序遍历
     */
    private void inOrder(TreeNode root, List<Integer> list) {
        Stack<TreeNode> stack = new Stack<>();
        if (root != null) {
            stack.push(root);
        }
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (cur != null) {
                stack.pop();
                if (cur.right != null)
                    stack.push(cur.right);// 添加右节点（空节点不入栈)
                stack.push(cur); // 添加中节点
                // 中节点访问，但还未处理
                stack.push(null);
                if (cur.left != null)
                    stack.push(cur.left);// 添加左节点（空节点不入栈)
            } else {
                // 只有遇到空节点的时候，才将下一个节点放进结果集
                stack.pop();
                cur = stack.pop();
                list.add(cur.val);
            }
        }
    }
}
// @lc code=end
