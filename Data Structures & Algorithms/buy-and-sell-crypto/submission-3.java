class Solution {
    public int maxProfit(int[] prices) {
        int min_value = Integer.MAX_VALUE;;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min_value){
                min_value = prices[i];
            }
            else if(prices[i] - min_value > maxProfit){
                maxProfit = prices[i] - min_value;
            }

        }

        return maxProfit;
        
    }
}
