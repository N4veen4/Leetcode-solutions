// Last updated: 14/07/2026, 14:48:41
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        
        int max=0;
        int min=Integer.MAX_VALUE;

        for(int num : nums){
            max=Math.max(num,max);
            min=Math.min(num,min);
        }
        //System.out.print(max-min);
        return (long)(max-min)*k;
    }
}