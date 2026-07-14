// Last updated: 14/07/2026, 14:51:57
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
    public boolean isValidBST(TreeNode root) {   

      List<Integer> arr=new ArrayList<>();
      inOrder(root,arr);

      for(int i=0;i<arr.size() -1;i++){
        if(arr.get(i)>=arr.get(i+1)) return false;
      }

      return true;
    }
    public List<Integer> inOrder(TreeNode root,List<Integer> arr){

        if(root== null) return arr;

        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);

        return arr;
    }
}






























  /*if(root==null) return true;
      // else if(root.left==null) return true;
       //else if(root.right==null) return true;
       
        else if(root.left!= null  && root.val <=root.left.val) return false;
        else if(root.right!= null && root.val >=root.right.val) return false;
        else if(root.left!=null && root.left.right!=null && root.val <= root.left.right.val) return false;
        else if(root.right!=null && root.right.left!=null && root.val >=root.right.left.val) return false;
       // else if(root.right!=null && root.right.left!=null && root.val <=root.right.left.val) return false;


   return(isValidBST(root.left) && isValidBST(root.right));  */