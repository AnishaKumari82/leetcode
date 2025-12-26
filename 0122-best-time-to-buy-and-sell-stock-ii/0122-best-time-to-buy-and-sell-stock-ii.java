

class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int profit ;
        int i=0;
        
        while(i < prices.length-1){
            if(prices[i]<prices[i+1]){
                profit = prices[i+1]-prices[i];
                i++;
                maxprofit += profit;


            }else{
                i++;
                
            }
           
        }
        return maxprofit;
    }
}