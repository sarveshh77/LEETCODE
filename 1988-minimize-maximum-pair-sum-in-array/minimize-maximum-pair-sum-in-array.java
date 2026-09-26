class Solution {
    public int minPairSum(int[] nums)
    {
        Arrays.sort(nums);
        int minimum = Integer.MIN_VALUE;
        int sum=0;

        int i =0;
        int j=nums.length-1;

        while(i<j)
        {
            sum=nums[i]+nums[j];
            i++;
            j--;

            minimum=Math.max(minimum,sum);
        }
        return minimum;
    }
}