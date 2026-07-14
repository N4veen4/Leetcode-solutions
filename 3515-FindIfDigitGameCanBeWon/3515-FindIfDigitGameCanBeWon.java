// Last updated: 14/07/2026, 14:48:46
class Solution {
    public boolean canAliceWin(int[] nums) {
        
        int Alice = 0;
        int Bob  = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<10 && nums[i]>=0){
                Bob+=nums[i];
            }else{
                Alice+=nums[i];
            }
        }
        if(Alice!=Bob ) { return true ;
        }else{
        return false;
        }
    }
}