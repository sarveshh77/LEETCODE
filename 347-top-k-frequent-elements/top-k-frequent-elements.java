class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int n : nums)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++)
        {
            int maxKey=0;
            int maxFreq=0;

            for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            {
                if(entry.getValue()>maxFreq)
                {
                    maxKey=entry.getKey();
                    maxFreq=entry.getValue();
                }
            }
            res[i]=maxKey;
            hm.remove(maxKey);
        }
       return res;
    }
}