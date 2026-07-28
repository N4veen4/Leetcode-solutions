// Last updated: 28/07/2026, 12:33:55
1class Solution {
2    public int arrayNesting(int[] nums) {
3        
4        int max_len=Integer.MIN_VALUE;
5        HashSet<Integer> visited=new HashSet<>();
6
7        for(int k=0;k<nums.length;k++){
8
9            if(!visited.contains(k)){
10                int cur_len=checker(k,nums,visited);
11                max_len=Math.max(max_len,cur_len);
12            }
13            
14        }
15        return max_len;
16    }
17
18    public static int checker(int k,int[] nums,HashSet<Integer> set){
19
20        int index=k;
21        boolean found=false;
22        int cur_len=0;
23
24        while(!found){
25
26            int val=nums[index];
27
28            if(set.contains(val)){
29                found=true;
30            }else{
31                set.add(nums[index]);
32                index=nums[index];
33                cur_len++;
34            }
35        }
36        return cur_len;
37    }
38}