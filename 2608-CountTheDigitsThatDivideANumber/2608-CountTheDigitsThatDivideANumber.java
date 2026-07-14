// Last updated: 14/07/2026, 14:49:06
class Solution {
    int res=0;
    public int countDigits(int num) {
        
        int ori=num;
        int rem=num;
       while(rem !=0){

        int div=rem%10;
        rem = rem/10;
        if(ori%div==0){
            res+=1;
        }else{
            res+=0;
        }
       }
       return res;

    }
}


















/* if(num<=0) return res;

        int ori=num;
        int div=num%10;
        int rem=num/10;
        int val=countdigits(ori,div);
        
        res+=val;
        return countDigits(rem);
    }

    public int countdigits(int ori,int div){

        if(ori % div == 0){
            return 1;
        }else{
            return 0;
        }*/