// Last updated: 14/07/2026, 14:51:07
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==1) return true;
        if(n<=0 || n%2 !=0) return false;

        return isPowerOfTwo(n/2);
        
    }
}