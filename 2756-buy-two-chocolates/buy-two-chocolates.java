// class Solution {
//     public int buyChoco(int[] prices, int money) 
//     {
//         Arrays.sort(prices);

//         if(prices[0]+prices[1]==money)
//         {
//             return 0;
//         }
//         else if(prices[0]+prices[1]>money)
//         {
//             return money;
//         }
//         else
//         {
//             return money-(prices[0]+prices[1]);
//         }
//     }
// }

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int sum = prices[0] + prices[1];

        if (sum > money) {
            return money;
        }

        return money - sum;
    }
}