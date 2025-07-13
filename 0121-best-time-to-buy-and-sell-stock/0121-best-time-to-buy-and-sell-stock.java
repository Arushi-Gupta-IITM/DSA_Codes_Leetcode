class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int cp = prices[0];

        int profit = 0;
        int maxProfit = 0;

        for(int i=1; i<n; i++) {
            if(prices[i] < cp) {
                cp = prices[i];
            }

            profit = prices[i] - cp;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }
}