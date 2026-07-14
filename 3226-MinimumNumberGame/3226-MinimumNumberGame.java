// Last updated: 14/07/2026, 14:48:52
class Solution {
    public int[] numberGame(int[] nums) {
     int alice=0;
     int bob=0;
      Arrays.sort(nums);
    int index=0;
    int[] arr=new int[nums.length];
      for(int i=0;i<nums.length;i+=2){
        alice=nums[i];
        bob=nums[i+1];

        arr[index++]=bob;
        arr[index++]=alice;
      }
        return arr;

        
    }
}