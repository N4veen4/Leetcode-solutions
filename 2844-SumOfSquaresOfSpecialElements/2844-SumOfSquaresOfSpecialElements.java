// Last updated: 14/07/2026, 14:48:58
class Solution {
    public int sumOfSquares(int[] nums) {
        
        int n=nums.length;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            if(n % j == 0){
                int sum_sq = nums[i]*nums[i];
                res+= sum_sq;
            }
        }
        return res;
    }
}