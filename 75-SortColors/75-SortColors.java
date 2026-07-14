// Last updated: 14/07/2026, 14:52:04
class Solution {
    public void sortColors(int[] nums) {
        
        for(int i=1; i<nums.length; i++){
            int key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
               // nums[j] = key;
                j--;
            }
            nums[j+1]=key;                                 
        }
    }
}