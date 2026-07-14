// Last updated: 14/07/2026, 14:49:04
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sumdigit=0;
        for(int i =0 ; i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                int num =nums[i];
                while(num!=0){
                    int last=num%10;
                    num=num/10;
                    sumdigit+=last;
                }
            }else{
                sumdigit+=nums[i];
            }
        } int res= sum-sumdigit;
        return res;
    }
}