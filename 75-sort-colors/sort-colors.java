class Solution {
    public void sortColors(int[] nums) 
    {   
        int zeroes=0;
        int ones=0;

        int n = nums.length;

        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                zeroes++;
            }
           if(nums[i]==1)
            {
                ones++;
            }
        
        }
        for(int i=0;i<n;i++)
        {
           if(zeroes>0) 
            {
                nums[i]=0;
                zeroes--;
            }
            else if(ones>0)
            {
                nums[i]=1;
                ones--;
            }
            else
            {
                nums[i]=2;
            }
        }
        
    }
}