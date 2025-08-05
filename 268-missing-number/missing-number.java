class Solution {
    public int missingNumber(int[] nums) 
    {
        HashMap<Integer,Boolean> hs = new HashMap();

        for(int num : nums)
        {
            hs.put(num,true);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!hs.containsKey(i))
            {
                return i;
            }
        }
        return -1;
    }
}