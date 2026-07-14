// Last updated: 14/07/2026, 14:48:55
class Solution {
    public int differenceOfSums(int n, int m) {


        int sum1=notDiv(n,m);
        int sum2=divBy(n,m);
        return sum1-sum2;
    }
    public int notDiv(int n,int m){
        int i=1;
        int res=0;
        while(i<=n){
            if(i%m != 0) res+=i;
            i++;
        }
        return res;
    }
    public int divBy(int n,int m){
        int i=1;
        int res=0;
        while(i<=n){
            if(i%m == 0) res+=i;
            i++;
        }
        return res;
}
}