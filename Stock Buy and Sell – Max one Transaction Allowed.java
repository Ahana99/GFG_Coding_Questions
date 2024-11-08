

// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice=0;
        for(int i = 0; i<prices.length; i++){
            minPrice=Math.min(minPrice, prices[i]);
            int profit = prices[i]-minPrice;
            maxPrice=Math.max(profit, maxPrice);
        }
        return maxPrice;
    }
}
