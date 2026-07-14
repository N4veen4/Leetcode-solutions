// Last updated: 14/07/2026, 14:50:54
class Solution {
    public boolean isPowerOfThree(int n) {

        if(n==1){
            return true;         
        } if(n<=0 || n%3!=0){
            return false;
        }
        n=n/3;
        return isPowerOfThree(n);
    }
}