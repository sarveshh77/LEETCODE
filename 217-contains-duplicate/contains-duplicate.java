import java.util.*;
class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> hs = new HashMap();

        for(int num : nums)
        {
            if(hs.containsKey(num))
            {
                return true;
            }
            hs.put(num,1);
        }
        return false;
    }
}