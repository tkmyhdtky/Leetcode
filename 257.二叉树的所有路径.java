import java.util.ArrayList;
import java.util.List;
/*
 * @Date: 2022-08-08 08:48:14
 * @LastEditTime: 2022-08-23 20:09:55
 * @FilePath: \Leetcode\257.二叉树的所有路径.java
 */
/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 */
import java.util.Stack;

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

    // public List<String> binaryTreePaths(TreeNode root) {
    // List<String> res = new ArrayList<>();
    // if (root == null) {
    // return res;
    // }
    // List<Integer> path = new ArrayList<>();
    // traversal(root, path, res);
    // return res;

    // }

    // 递归法
    // private void traversal(TreeNode cur, List<Integer> path, List<String> result) {
    //     path.add(cur.val); // 叶子结点
    //     if (cur.left == null && cur.right == null) {
    //         StringBuilder spath = new StringBuilder();
    //         for (int i = 0; i < path.size() - 1; i++) {
    //             spath.append(path.get(i)).append("->");
    //         }
    //         spath.append(path.get(path.size() - 1));
    //         result.add(spath.toString());
    //         return;
    //     }
    //     if (cur.left != null) {
    //         traversal(cur.left, path, result);
    //         path.remove(path.size() - 1); // 回溯
    //     }
    //     if (cur.right != null) {
    //         traversal(cur.right, path, result);
    //         path.remove(path.size() - 1); // 回溯
    //     }
    // }

    /**
     * @description: 迭代法
     * @return {*}
     */
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<Object> stack = new Stack<>();
        // 节点和路径同时入栈
        stack.push(root);
        stack.push(root.val + "");
        while (!stack.isEmpty()) {
            // 节点和路径同时出栈
            String path = (String) stack.pop();
            TreeNode node = (TreeNode) stack.pop();
            // 是叶子节点
            if (node.left == null && node.right == null) {
                res.add(path);
            }
            //右节点不为空
            if (node.right!=null) {
                stack.push(node.right);
                stack.push(path+"->"+node.right.val);
            }
            //左节点不为空
            if (node.left!=null) {
                stack.push(node.left);
                stack.push(path+"->"+node.left.val);
            }
        }
        return res;
    }
}
// @lc code=end
