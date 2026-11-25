class Solution {
    public int findNonMinOrMax(int[] nums) 
    {
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;

        if(nums.length<=2)
        {
            return -1;
        }

        for(int i = 0; i < nums.length; i++)
        {
            min1 = Math.min(nums[i],min1);
            max1 = Math.max(nums[i],max1);
        }
        System.out.println(min1 + " "+ max1);
        int i = 0;

        while(nums[i]==min1 || nums[i]==max1)
        {
            i++;
        }
        return nums[i];

    }
}