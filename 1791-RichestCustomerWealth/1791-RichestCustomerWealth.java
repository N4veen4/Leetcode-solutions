// Last updated: 14/07/2026, 14:49:30
class Solution {
    public int maximumWealth(int[][] arr) {
        
        int high=0;
        for(int i=0;i<arr.length; i++){
            int s=0;
            for(int j=0;j<arr[0].length; j++){
                
                 s+=arr[i][j];
                 
             }if(s >= high)
                high = s;
        }return high;
    }
}