// Last updated: 14/07/2026, 14:51:48
class Solution {
    public int maxProfit(int[] prices) {

        int min=prices[0];
        int profit=0;
        int p=0;

        for(int i=1;i<=prices.length-1;i++){

            if(prices[i]<min){
                min=prices[i];
            }else {
                p=prices[i]-min;
                if(p>profit){
                    profit=p;
                }
            }
           
            } return profit;
        
















      /*  int buyprice=0;
        int day=0;
        int count=0;
buyprice=prices[0];
        for(int i=1;i<=len-2;i++){          
            if(prices[i]<buyprice){
                buyprice=prices[i];   
                day=i;
            }            
        }      
               int profit=0;
        int p=0;

        for(int i=day+1; i<=prices.length-1;i++){
            if(prices[i]==0){
                continue;
            }
            p=prices [i] - buyprice;
            
            if(p>=profit){
                profit=p;
            }
                  }
    return profit;*/
    }
    }