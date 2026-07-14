// Last updated: 14/07/2026, 14:52:17
class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int left=0;
        int right=nums.length-1;

        int[] arr={-1,-1};

        while(left<=right){
            if(nums[left] == target && nums[right] == target){
                arr[0]=left;
                arr[1]=right;
                break;
            }else if(nums[left]<target){
                left++;
            }else{
                if(nums[right]>target){
                    right--;
                }
            }
        }
        return arr;
    }
}