import java.util.Stack;
/*
 * @lc app=leetcode.cn id=404 lang=java
 *
 * [404] 左叶子之和
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
    // 左叶子节点判断：如果该节点的左节点不为空，该节点的左节点的左节点为空，该节点的左节点的右节点为空，则找到了一个左叶子

    // 递归法
    // public int sumOfLeftLeaves(TreeNode root) {
    // // 终止条件
    // if (root == null) {
    // return 0;
    // }
    // // 递归逻辑：当遇到左叶子节点的时候，记录数值，然后通过递归求取左子树左叶子之和，和 右子树左叶子之和，相加便是整个树的左叶子之和。
    // int leftValue = sumOfLeftLeaves(root.left);
    // int rightValue = sumOfLeftLeaves(root.right);
    // int midValue = 0;
    // if (root.left != null && root.left.left == null && root.left.right == null) {
    // midValue = root.left.val;
    // }
    // int sum=midValue+leftValue+rightValue;
    // return sum;
    // }
    // 迭代法
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) {
            return 0;
        }
        stack.push(root);
        int res = 0;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null && node.left.left == null && node.left.right == null) {
                res += node.left.val;
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return res;
    }
}
// @lc code=end
