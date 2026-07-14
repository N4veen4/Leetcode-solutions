// Last updated: 14/07/2026, 14:50:18
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int left=0;
        int sum=0;
        int max_sum=Integer.MIN_VALUE;

        for(int right = 0 ; right<nums.length ; right++){

            sum+=nums[right];
            if(right - left +1 >k){
                sum-=nums[left];
                left++;
            }
            if(right - left +1 == k){
                if(sum > max_sum){
                    max_sum = sum;
                }   
            }
        }
        return (double) max_sum/k;
    }
}