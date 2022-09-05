
/*
 * @Date: 2022-09-03 15:30:07
 * @LastEditors: wangzhao wangzhao@swu.com
 * @LastEditTime: 2022-09-03 15:46:42
 * @Description: Default
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> path = new LinkedList<>();
        preOrderDfs(root, targetSum, res, path);
        return res;
    }

    public void preOrderDfs(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> path) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum - root.val == 0) {
                res.add(new ArrayList<>(path));
            }
            return;
        }
        if (root.left != null) {
            preOrderDfs(root.left, targetSum - root.val, res, path);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            preOrderDfs(root.right, targetSum - root.val, res, path);
            path.remove(path.size() - 1);
        }
    }
}
// @lc code=end
