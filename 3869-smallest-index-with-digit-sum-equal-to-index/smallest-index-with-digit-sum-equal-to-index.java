class Solution {
    public int smallestIndex(int[] nums) 
    {
        for(int i=0;i<nums.length;i++)
        {
            int digit=nums[i];
            int sum=0;

            while(digit!=0)
            {
                int rem = digit%10;
                sum+=rem;
                digit=digit/10;
            }
            if(sum==i)
            {
                return i;
            }
        }
        return -1;
    }
}