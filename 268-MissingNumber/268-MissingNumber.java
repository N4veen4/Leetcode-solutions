// Last updated: 14/07/2026, 14:50:58
class Solution {
    public int missingNumber(int[] nums) {
     int l=nums.length;
     int n=l*(l+1)/2;
     int p=0;
     for (int i=0;i<l;i++){
        p+=nums[i];
     }
     return n-p;

    }
}