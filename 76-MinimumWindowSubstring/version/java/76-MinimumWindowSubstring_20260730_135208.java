// Last updated: 30/07/2026, 13:52:08
1class Solution {
2    public int dominantIndex(int[] nums) {
3        
4        int max=0;
5        int index=-1;
6
7        for(int i=0;i<nums.length;i++){
8            if(max < nums[i]){
9                max=nums[i];
10                index=i;
11            }
12            //max=Math.max(max,arr[i]);
13            nums[i]=nums[i]*2;
14        }
15
16        System.out.print(Arrays.toString(nums));
17        
18        for(int i=0;i<nums.length;i++){
19            if(i!=index && max < nums[i]){
20                return -1;
21            }
22        }
23
24        return index;
25    }
26}