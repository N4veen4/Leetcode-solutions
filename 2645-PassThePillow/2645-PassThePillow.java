// Last updated: 14/07/2026, 14:49:03
class Solution {
    public int passThePillow(int n, int time) {
        
        int turn = ((n-1)*2);
        time%=turn;
       return time<n ? (time+1):(turn - time+1);
    }
} 
// } if(time<n)  return time+1;
//         return (turn - time+1);