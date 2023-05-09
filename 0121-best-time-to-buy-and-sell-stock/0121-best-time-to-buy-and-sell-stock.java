class Solution {
    public int maxProfit(int[] prices) 
    {
        int currentGap = 0, profit = 0;
        if (prices.length <= 1)
            return 0;
        for (int i=1; i < prices.length; i++) 
        {
            currentGap += prices[i] - prices[i - 1];
            if (currentGap < 0)
                currentGap = 0;
            else if (currentGap > profit)
                profit = currentGap;
        }
        return profit;
    }
}