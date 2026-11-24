class Solution {
    public int[] numberGame(int[] nums) 
    {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];
        int k = 0;
        for(int i = 1; i<nums.length; i+=2)
        {
            ans[k]=nums[i];
            k++;
            ans[k] = nums[i-1];
            k++;
        }
        return ans;
    }
}