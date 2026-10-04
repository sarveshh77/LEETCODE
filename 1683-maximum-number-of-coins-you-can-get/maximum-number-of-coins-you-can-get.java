class Solution {
    public int maxCoins(int[] piles) 
    {
        Arrays.sort(piles);
        int sum=0;
        int left=0;
        int right=piles.length-1;

        while(left<right)
        {
            sum+=piles[right-1];
            right=right-2;
            left=left+1;
        }
        return sum;
        
    }
}