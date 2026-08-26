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
    class TreeInfo{
        int height;
        int diam;

        public TreeInfo(int height, int diam){
            this.height = height;
            this.diam = diam;
        }
    }

    public TreeInfo diameter(TreeNode root) {

        if(root == null) return new TreeInfo(0,0);

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myheight = Math.max(left.height, right.height) + 1;

        int d1 = left.diam;
        int d2 = right.diam;
        int d3 = left.height + right.height;

        int myDiam = Math.max(d3, Math.max(d1, d2));

        return new TreeInfo(myheight, myDiam);
        
    }

    public int diameterOfBinaryTree(TreeNode root){
        TreeInfo info = diameter(root);
        return info.diam;
    }
}
