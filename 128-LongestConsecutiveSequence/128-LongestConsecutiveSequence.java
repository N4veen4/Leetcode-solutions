// Last updated: 14/07/2026, 14:51:41
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int curr_c=1,max_c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]-1==nums[i-1]) curr_c++;
            else{
                max_c=Math.max(max_c,curr_c);
                curr_c=1;
            }
            
        }
        return Math.max(max_c,curr_c);
    }
}
