// Last updated: 14/07/2026, 14:51:01
class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num>0){
            
            sum+=num%10;
            num=num/10;
        }
        if(sum > 9 ){
            return addDigits(sum);
        }else{
            return sum;
        }
        
    }
}