class Solution {
    public int arrangeCoins(int n) 
    {
        if(n==1)
        {
            return n;
        }
        int count=0;
        for(int i=1;i<=n;i++)
        {
            count++;
            n=n-i;
        }
        return count;
    }
}