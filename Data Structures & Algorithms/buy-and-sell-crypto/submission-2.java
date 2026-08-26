class Solution {
    public int maxProfit(int[] prices) {

        int largestDiff = 0;
        int minSoFar = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            if(minSoFar > prices[i]){
                minSoFar = prices[i];
            }else{
                largestDiff = Math.max(largestDiff, prices[i] - minSoFar);
            }
        }

        return largestDiff;
        
    }
}
