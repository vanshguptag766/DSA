/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void traverse(TreeNode node, int height, List<Integer> view) {
        if (node == null) return;
        if (height == view.size()) {
            view.add(node.val);
        }
        traverse(node.right, height + 1, view);
        traverse(node.left, height + 1, view);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> view = new ArrayList<>();
        traverse(root, 0, view);
        return view;
    }
}