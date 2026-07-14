// Last updated: 14/07/2026, 14:49:54
class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int zero_count=0;
        int max=0;
        int l=0;

        for(int r=0;r<nums.length;r++){

            if(nums[r] == 0){
                zero_count++;
            }

            while(zero_count > k){
               
                if(nums[l] == 0){
                    zero_count--;
                }
                l++;
            }
             max=Math.max(r-l+1,max);
        }
        return max;

    }
}