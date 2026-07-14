// Last updated: 14/07/2026, 14:52:03
class Solution {
    public int removeDuplicates(int[] nums) {
        int p=1;
        int uni=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                uni++;
            }
            else{
                uni=1;
            }
            if(uni<=2){
                nums[p]=nums[i];
                p++;
            }
        }
        return p;
    }
}