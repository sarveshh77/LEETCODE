class Solution {
    public int countWords(String[] words1, String[] words2) 
    {
        int count = 0;

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(String s1 : words1)
        {
            map1.put(s1,map1.getOrDefault(s1,0)+1);
        }
        for(String s2 : words2)
        {
            map2.put(s2,map2.getOrDefault(s2,0)+1);
        }

        for(String key : map1.keySet())
        {
            if(map1.get(key) == 1 && map2.getOrDefault(key,0) == 1)
            {
                count++;
            }
        }
        return count;
    }
}