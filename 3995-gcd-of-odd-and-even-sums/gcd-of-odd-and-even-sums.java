class Solution {
    public int gcdOfOddEvenSums(int n) 
    {
        int oddSum=0;
        int evenSum=0;

        for(int i=2;i<=2*n;i+=2)
        {
            evenSum+=i;
        } 
        for(int j=1;j<=2*n-1;j+=2)
        {
            oddSum+=j;
        }
        while(oddSum!=0)
        {
            int temp=oddSum;
            oddSum=evenSum%oddSum;
            evenSum=temp;
        }
        return evenSum;
    }
}