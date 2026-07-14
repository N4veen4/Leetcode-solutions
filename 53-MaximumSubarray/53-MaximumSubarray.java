// Last updated: 14/07/2026, 14:52:12
class Solution {
    public int maxSubArray(int[] nums) {
        
        int cur_sum=nums[0];
        int max_sum=nums[0];

        for(int i=1;i<nums.length;i++){
            cur_sum=Math.max(nums[i],cur_sum+nums[i]);
            max_sum=Math.max(max_sum,cur_sum);
        }

        return max_sum;
    }
}