// Last updated: 14/07/2026, 14:52:15
class Solution {
    public int searchInsert(int[] nums, int target) {
        int pre=0;
        //if(target == 0) return 0;
       for(int i=0; i<nums.length;i++){
        if(nums[i] == target) return i;
        else if(target<nums[i]){
            return pre=i;
        }else{
            pre = i;
        }
       }
       return pre+1;

    }
}
       