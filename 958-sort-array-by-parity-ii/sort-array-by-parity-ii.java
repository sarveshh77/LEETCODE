class Solution {
    public int[] sortArrayByParityII(int[] nums) 
    {
        // int even=0;
        int odd=1;

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]%2==0)
        //     {
        //         if(even<=nums.length-1)
        //         {
        //             nums[even]=nums[i];
        //             even+=2;
        //         }
        //     }
        //     else
        //     {
        //         nums[odd]=nums[i];
        //         odd+=2;
        //     }
        // }
        // return nums;

        for(int even=0;even<nums.length;even+=2)
        {
            if(nums[even]%2!=0)
            {
                while(nums[odd]%2!=0)
                {
                    odd+=2; 
                }
                int temp=nums[odd];
                nums[odd]=nums[even];
                nums[even]=temp;
                odd+=2;
            }
            
        }
        return nums;
    }
}