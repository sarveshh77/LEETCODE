import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int nums2[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums2[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums2);
        return nums2;

        //Built in method (sort) is used here.
    }
}