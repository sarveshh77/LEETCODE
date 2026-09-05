class Solution {
    public int minOperations(int[] nums) 
    {
        int cal=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                int count = nums[i]-nums[i+1]+1;
                nums[i+1]=nums[i+1]+count;
                cal+=count;
            }
        }
        return cal;
    }
}