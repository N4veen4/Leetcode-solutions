// Last updated: 21/09/2026, 11:29:41
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        
4        int n=nums.length;
5
6        for(int i=0;i<n;i++){
7
8            while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i]-1]){
9                swap(nums,i,nums[i]-1);
10            }
11        }
12
13        for(int i=0;i<n;i++){
14            if(nums[i] != i+1){
15                return i+1;
16            }
17        }
18        return n+1;
19    }
20     public static void swap(int[] arr,int i,int j){
21
22            int temp= arr[i];
23            arr[i] = arr[j];
24            arr[j]=temp;
25        }
26}