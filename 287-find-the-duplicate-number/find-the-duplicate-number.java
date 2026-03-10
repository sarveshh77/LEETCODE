class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashSet<Integer> hSet = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(hSet.contains(nums[i]))
            {
                return nums[i];
            }
            else
            {
                hSet.add(nums[i]);
            }
        }
        return -1;
    }
}