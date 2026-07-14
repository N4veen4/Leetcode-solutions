// Last updated: 14/07/2026, 14:49:23
class Solution {
    public int findGCD(int[] nums) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i: nums){
            if(i>max) max=i;
            if(i<min) min=i;
        }
        int res=0;
        for(int i=1;i<=max; i++){
            if( min % i == 0 && max % i == 0 )  res=i;
        }
        return res;
    }
}