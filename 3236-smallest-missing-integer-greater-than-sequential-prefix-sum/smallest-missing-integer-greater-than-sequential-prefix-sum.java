class Solution {
    public int missingInteger(int[] nums) 
    {
        int sum=0;
        int k =1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[k]-nums[i]==1)
            {
                k++;

            }
            else
            {
                break;
            }
            
        }
        for(int j=0;j<k;j++)
        {
            sum+=nums[j];
        }
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        while(true)
        {
            if(hs.contains(sum))
            {
                sum++;
            }
            else
            {
                return sum;
            }
        }

    }
}