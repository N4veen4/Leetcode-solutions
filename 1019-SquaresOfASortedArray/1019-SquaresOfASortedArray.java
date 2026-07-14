// Last updated: 14/07/2026, 14:49:56
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        if(nums.length == 0) return nums;
        for(int i=0;i<nums.length;i++){
           
            nums[i]=nums[i]*nums[i];
        } 
        Arrays.sort(nums);
        return nums;
          
    }
}