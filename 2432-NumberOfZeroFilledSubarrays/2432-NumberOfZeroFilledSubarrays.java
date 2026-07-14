// Last updated: 14/07/2026, 14:49:09
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        int trigger=0;
        long count=0;

        for(int num:nums){
            if(num == 0){
                trigger++;
                count+=trigger;
            }else{
                trigger=0;
            }
        }

        return count;
    }
}