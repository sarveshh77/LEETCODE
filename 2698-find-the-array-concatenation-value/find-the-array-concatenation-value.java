class Solution {
    public long findTheArrayConcVal(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        long sum=0;

        while(left<=right)
        {
            if(left==right)
            {
                sum+=nums[left];
            }
            else
            {
                int temp=1;
                int tempNum=nums[right];

                while(tempNum!=0)
                {
                    tempNum=tempNum/10;
                    temp=temp*10;
                }
                sum+=nums[left]*temp+nums[right];

            }
             left++;
             right--;
        }
         return sum;
    }
}