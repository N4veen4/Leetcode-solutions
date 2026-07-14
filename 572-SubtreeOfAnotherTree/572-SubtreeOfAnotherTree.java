// Last updated: 14/07/2026, 14:50:22
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        
        if(root == null) return false;
    if(findSubtree(root,subRoot)) return true;
        
     return (isSubtree(root.left,subRoot) ||  isSubtree(root.right,subRoot));
    }
    
    public boolean findSubtree(TreeNode root ,TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null ) return false;

        return(root.val == subRoot.val && findSubtree(root.left,subRoot.left) && findSubtree(root.right,subRoot.right));
    }
}  