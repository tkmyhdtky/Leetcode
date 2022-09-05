import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @Date: 2022-09-03 15:48:40
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-05 21:41:28
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
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
    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(inorder, postorder, 0, inorder.length, 0, postorder.length);
    }

    public TreeNode findNode(int[] inorder, int[] postorder, int inBegin, int inEnd, int postBegin, int postEnd) {
        if (inBegin >= inEnd || postBegin >= postEnd) {
            return null;
        }
        // 找到后序遍历的最后一个元素在中序遍历中的位置
        int rootIndex = map.get(postorder[postEnd - 1]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        // 保存中序左子树个数，用来确定后序数列的个数
        int lenOfLeft = rootIndex - inBegin;
        root.left = findNode(inorder, postorder, inBegin, rootIndex, postBegin, postBegin + lenOfLeft);
        root.right = findNode(inorder, postorder, rootIndex + 1, inEnd, postBegin + lenOfLeft, postEnd - 1);
        return root;
    }

}
// @lc code=end
