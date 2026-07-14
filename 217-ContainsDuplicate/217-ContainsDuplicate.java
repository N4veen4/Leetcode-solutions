// Last updated: 14/07/2026, 14:51:11
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
         for(int i=0;i<nums.length-1;i++){
             if(nums[i]== nums[i+1]) return true;
         }
      
        return false;
    }
}




 /* for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                
                 if(nums[i]== nums[j]) return true;
        }
        }*/