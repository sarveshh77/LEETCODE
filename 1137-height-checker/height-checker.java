class Solution {
    public int heightChecker(int[] heights) 
    {
        int count=0;
        int expected[]= heights.clone();
        int j;

        for(int i=0;i<=expected.length-2;i++)
        {
            int mini=i;

            for(j=i;j<=expected.length-1;j++)
            {
                if(expected[j]<expected[mini])
                {
                    mini=j;
                }
            }
            int temp=expected[mini];
            expected[mini]=expected[i];
            expected[i]=temp;
        }

        for(int i=0;i<expected.length;i++)
        {
            if(expected[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
    }
}