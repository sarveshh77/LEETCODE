class Solution {
    public int maximumProduct(int[] nums) 
    {
        Arrays.sort(nums);
        int res1=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];

        int res2=nums[0]*nums[1];

        if(res1>=(res2*nums[nums.length-1])){
            return res1;
        }
        return res2*nums[nums.length-1];
    }
}