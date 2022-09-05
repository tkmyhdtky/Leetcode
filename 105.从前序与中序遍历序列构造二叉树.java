import java.util.HashMap;
import java.util.Map;

/*
 * @Date: 2022-09-05 21:41:59
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-05 21:49:31
 * @Description: Default
 */
/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return findNode(inorder, preorder, 0, inorder.length, 0, preorder.length);
    }

    public TreeNode findNode(int[] inorder, int[] preorder, int inBegin, int inEnd, int preBegin, int preEnd) {
        if (inBegin >= inEnd || preBegin >= preEnd) {
            return null;
        }
        // 找到前序遍历的第一个元素在中序遍历中的位置
        int rootIndex = map.get(preorder[preBegin]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        // 保存中序左子树个数，用来确定后序数列的个数
        int lenOfLeft = rootIndex - inBegin;
        root.left = findNode(inorder, preorder, inBegin, rootIndex, preBegin + 1, preBegin + 1 + lenOfLeft);
        root.right = findNode(inorder, preorder, rootIndex + 1, inEnd, preBegin + lenOfLeft + 1, preEnd);
        return root;
    }
}
// @lc code=end
