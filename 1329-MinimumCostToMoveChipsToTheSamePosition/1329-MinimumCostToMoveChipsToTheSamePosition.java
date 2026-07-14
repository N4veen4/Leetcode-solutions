// Last updated: 14/07/2026, 14:49:46
class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int evencount=0;
        int oddcount=0;
        int ans=0;

        for(int i=0;i<position.length;i++){
            if(position[i]%2==0) evencount++;
            else oddcount++;
            }
            ans=Math.min(evencount,oddcount);
             return ans;
    }
}


        
    
