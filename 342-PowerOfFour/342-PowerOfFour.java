// Last updated: 14/07/2026, 14:50:50
class Solution {
    public boolean isPowerOfFour(int n) {

        if(n==0) return false;
        if(n==1) return true;
        if(n<=0 || n%4!=0) return false;
       return isPowerOfFour(n/4);
    }
}