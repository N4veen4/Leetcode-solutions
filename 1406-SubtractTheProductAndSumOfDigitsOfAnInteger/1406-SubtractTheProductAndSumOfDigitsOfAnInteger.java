// Last updated: 14/07/2026, 14:49:45
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=Sum(n);
        int prod=product(n);

        int res=differentBetweenSumAndProduct(sum,prod);
        return res;
    }
    public int product(int n){
        int prod=1;
        while(n!=0){
            int Lastdigit=n%10;
            prod*=Lastdigit;
             n = n/10;
        }
        return prod;
    } public int Sum(int n){
        int sum=0;
        while(n!=0){
            int Lastdigit=n%10;
            sum+=Lastdigit;
             n = n/10;
        }
        return sum;
    }
    int differentBetweenSumAndProduct(int sum,int prod){
        int res = prod-sum;
        return res;
    }
}