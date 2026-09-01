class Solution {
    public int minimumBoxes(int[] apple, int[] capacity)
    {
        int sum=0;
        int count=0;
        for(int num : apple)
        {
            sum+=num;
        }
        Arrays.sort(capacity);

        for(int i=capacity.length-1;i>=0;i--)
        {
            if(capacity[i]>=sum)
            {
                count++;
                i=-1;
            }
            else
            {
                sum=sum-capacity[i];
                count++;
            }
        }
        return count;
    }
}