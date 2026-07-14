// Last updated: 14/07/2026, 14:49:18
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0) return true;
       if(num%10==0) return false;
        else return true;



        
      //  int r1=reverse(num);
      //  int r2 =reverse(r1);
        //if(r2 == num) return true;
       // return false;

    }
    public int reverse(int num){

        int temp=num;
        int res=0;
        while(temp > 0){
            res=res*10+temp%10;
            temp=temp/10;
        }
        
        return res;
    }
}