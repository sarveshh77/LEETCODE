class Solution {
    public int minimumCost(int[] cost) 
    {
        if(cost.length==1)
        {
            return cost[0];
        }
       int sum=0;
       Arrays.sort(cost);
       for(int i=cost.length-1;i>=0;i=i-3)
       {
            if(i==0)
            {
                sum+=cost[i];

            }
            else
            {
                 sum+=cost[i]+cost[i-1];

            }
        }
        return sum;
    }
}