class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
       HashMap <Integer,Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
          int need= target-nums[i];
          if(map.containsKey(need))
          {
            return new int[] {map.get(need),i};
          }
          map.put(nums[i],i);
       }
    //     while(left<right)
    //     {
    //         if(nums[left]+nums[right]==target)
    //         {
    //             return new int[] {left,right};
    //         }
    //         else if(nums[left]+nums[right]>target)
    //         {
    //             right-=1;
    //         }
    //         else
    //         {
    //             left+=1;
    //         }
    //     }
     return new int[] {-1,-1};

}
}