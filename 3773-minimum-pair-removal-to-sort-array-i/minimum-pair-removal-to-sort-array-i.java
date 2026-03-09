class Solution {

    public int minimumPairRemoval(int[] nums) {

        if(isSorted(nums))
            return 0;

        int minSum = Integer.MAX_VALUE;
        int index = -1;

        for(int i = 0; i < nums.length - 1; i++)
        {
            int sum = nums[i] + nums[i+1];

            if(sum < minSum)
            {
                minSum = sum;
                index = i;
            }
        }

        int[] newNums = new int[nums.length - 1];
        int k = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(i == index)
            {
                newNums[k++] = minSum;
                i++;
            }
            else
            {
                newNums[k++] = nums[i];
            }
        }

        return 1 + minimumPairRemoval(newNums);
    }

    private boolean isSorted(int[] nums)
    {
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < nums[i-1])
                return false;
        }
        return true;
    }
}