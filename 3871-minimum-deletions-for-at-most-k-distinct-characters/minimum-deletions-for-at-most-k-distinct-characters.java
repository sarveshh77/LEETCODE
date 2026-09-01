class Solution {
    public int minDeletion(String s, int k) 
    {
        int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((a, b) -> a.getValue() - b.getValue());

        while(list.size()>k)
        {
            count+=list.get(0).getValue();
            list.remove(0);
        
        }

        return count;
    }
}