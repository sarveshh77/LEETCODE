
class Solution {
    public double minPrice(int[] prices, int[] discounts) 
    {
        double minSum=0;

        Arrays.sort(prices);
        Arrays.sort(discounts);

        int i=prices.length-1;
        int j=discounts.length-1;

        while(i>=0 && j>=0)
        {
            minSum+= prices[i]*(100-discounts[j])/100.0;
            i--;
            j--;
        }
        while(i>=0)
        {
            minSum+= prices[i];
            i--;
        }
        return minSum;
    }
}