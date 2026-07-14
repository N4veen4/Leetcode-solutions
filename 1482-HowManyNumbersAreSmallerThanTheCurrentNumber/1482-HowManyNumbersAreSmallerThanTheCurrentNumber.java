// Last updated: 14/07/2026, 14:49:40
class Solution {
     public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < nums[i]){
                    count++;
            }
        }arr[i]=count;
   }
        return arr;
 }
    
}


















// USED FOR LIST RETURN TYPE
 /*int[] arr=new int[5];
    int index=0;
    public int[] smallerNumbersThanCurrent(int[] nums) {
       
        if(index>nums.length) return arr;
      int res= findNo(nums[index],nums);
        //list.add(res);
        arr[index]=res;
        smallerNumbersThanCurrent(nums);
        return arr;
    }
    public static int findNo(int current, int[] nums){

        int count =0;
        for(int i =0;i<nums.length;i++){
            if(current == nums[i]) count++;
        }
        return count;*/