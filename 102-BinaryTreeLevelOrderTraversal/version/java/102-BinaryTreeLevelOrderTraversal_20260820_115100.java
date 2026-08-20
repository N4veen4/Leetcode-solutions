// Last updated: 20/08/2026, 11:51:00
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16
17class Solution {
18    public List<List<Integer>> levelOrder(TreeNode root) {
19        Queue<TreeNode> q = new LinkedList<>();
20        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
21        if(root==null){
22            return finalAns;
23        }
24        q.add(root);
25        while(!q.isEmpty()){
26            int levels = q.size();
27            List<Integer> subLevels = new ArrayList<>();
28            for(int i=0;i<levels;i++){
29                if(q.peek().left!=null){
30                    q.add(q.peek().left);
31                }
32                if(q.peek().right!=null){
33                    q.add(q.peek().right);
34                }
35                subLevels.add(q.remove().val);
36            }
37            finalAns.add(subLevels);
38        }
39        return finalAns;
40    }
41}