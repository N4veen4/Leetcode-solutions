// Last updated: 14/07/2026, 14:50:09
class Solution {
    public int search(int[] nums, int target) {
        
        int l=0;
        int r=nums.length-1;

        while(l<=r){
            int mid= l + (r-l)/2;

            if(nums[mid]==target){
                return mid;
            }else if(nums[mid] > target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
}