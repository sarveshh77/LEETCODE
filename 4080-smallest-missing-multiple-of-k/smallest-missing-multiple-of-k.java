class Solution {
    public int missingMultiple(int[] nums, int k) 
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++)
        {
            if(!hs.contains(k*i))
            {
                return k*i;
            }
            if(nums.length==1)
            {
                if(nums[0]==k)
                {
                    return k*2;
                }
                if(!hs.contains(k*i))
                {
                    return k*i;
                }
            }
        }
        return 0;
    }
}