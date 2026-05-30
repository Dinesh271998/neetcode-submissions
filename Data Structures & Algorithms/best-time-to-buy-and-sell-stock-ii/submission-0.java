class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int temp = prices[0];

        if(prices.length == 1){
            return 0;
        }

        for(int i = 1; i < prices.length; i++){
            int diff = prices[i] - temp;

            if(diff <= 0){
                temp = prices[i];
            } else {
                profit += diff;
                temp = prices[i];
            }
        }

        return profit;
    }
}