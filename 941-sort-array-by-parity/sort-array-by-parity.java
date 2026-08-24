class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
        int[] newArray = new int[nums.length];
        int k=nums.length-1;
        int m=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                newArray[m]=nums[i];
                m++;
            }
            else
            {
                newArray[k]=nums[i];
                k--;
            }
        }
        return newArray;
    }
}