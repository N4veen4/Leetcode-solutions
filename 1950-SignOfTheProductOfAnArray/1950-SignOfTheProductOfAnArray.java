// Last updated: 14/07/2026, 14:49:26
class Solution {
    public int arraySign(int[] nums) {
         int count =0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) count++;
         }
         if(count%2==0){
            return 1;
         }else{
            return -1;
         }
    }
}




/*int prodsum=0;
         int prod=nums[0];
        for(int i=1;i<nums.length;i++){
           prod=prod*nums[i];
           //prodsum+=prod;
        }if(prod >=1) return 1;
        else if(prod == 0) return 0;
        else if(prod<0) return -1;
        return 2;*/