// Last updated: 31/08/2026, 14:06:32
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        
4        int count=0;
5        for(int i=0;i<nums.length;i++){
6
7            int sum=0;
8
9            for(int j=i;j<nums.length;j++){
10                
11                sum+=nums[j];
12                if(sum==k) count++;
13                
14            }
15
16        }
17
18        return count;
19    }
20}