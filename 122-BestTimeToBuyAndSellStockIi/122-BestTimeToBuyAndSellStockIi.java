// Last updated: 14/07/2026, 14:51:50
class Solution {
    public int maxProfit(int[] prices) {
        
        int buy=prices[0];
        int profit=0;
        int day=0;

        while(day < prices.length){

            if(buy < prices[day]){
                profit+=prices[day] - buy;
                buy=prices[day];
            }else{
                buy=prices[day];
            }
            day++;
        }
        return profit;
    }
}