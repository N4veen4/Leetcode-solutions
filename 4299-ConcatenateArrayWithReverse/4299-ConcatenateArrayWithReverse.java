// Last updated: 14/07/2026, 14:48:45
class Solution {
    public int[] concatWithReverse(int[] nums) {

        int n=nums.length;
        int[] ans=new int[2*n];

        for(int i =0;i<n;i++){
            ans[i]=nums[i];
        }  

        for(int i=0;i<n;i++){
            ans[n+i]=nums[n-1-i];
        }
        return ans;
    }
}