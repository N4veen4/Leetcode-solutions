// Last updated: 14/07/2026, 14:49:35
class Solution {
    public int xorOperation(int n, int start) {
        
      
        int xor=0;
       
       for(int i=0;i<n;i++){
           xor^= start+2*i;
       }
        
        return xor;
    }
}