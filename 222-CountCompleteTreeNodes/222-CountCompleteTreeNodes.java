// Last updated: 14/07/2026, 14:51:08
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
    public int countNodes(TreeNode root) {
        
       if(root == null) return 0;

       int lefthight=leftHight(root);
       int righthight=rightHight(root);

       if(lefthight == righthight){
            return (1 << lefthight)-1;
       }

       return 1+countNodes(root.left)+countNodes(root.right);

    }
    public int leftHight(TreeNode root){
        
        int h=0;
        while(root!=null){
            h++;
            root=root.left;
        }
        return h;
    }
    public int rightHight(TreeNode root){
        
        int h=0;
        while(root!=null){
            h++;
            root=root.right;
        }
        return h;
    }
}