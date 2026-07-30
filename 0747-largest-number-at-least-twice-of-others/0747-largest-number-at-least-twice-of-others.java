class Solution {
    public int dominantIndex(int[] nums) {
        
        int max=0;
        int index=-1;

        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max=nums[i];
                index=i;
            }
            //max=Math.max(max,arr[i]);
            nums[i]=nums[i]*2;
        }

        System.out.print(Arrays.toString(nums));
        
        for(int i=0;i<nums.length;i++){
            if(i!=index && max < nums[i]){
                return -1;
            }
        }

        return index;
    }
}