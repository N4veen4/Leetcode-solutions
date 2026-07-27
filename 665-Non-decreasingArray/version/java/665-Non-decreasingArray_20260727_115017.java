// Last updated: 27/07/2026, 11:50:17
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        
4        int count = 0;
5
6        for(int i=1;i<nums.length;i++){
7
8            if(nums[i] < nums[i-1]){
9                count++;
10                
11                if(count>1) return false;
12
13                if(i==1 || nums[i] >= nums[i-2]){
14                    nums[i-1]=nums[i];
15                }else{
16                    nums[i]=nums[i-1];
17                }
18
19                i=0;
20            }
21        }
22        return true;
23    }
24}