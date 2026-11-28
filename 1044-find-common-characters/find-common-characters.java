
class Solution {
    public List<String> commonChars(String[] words) 
    {
        ArrayList<HashMap<String,Integer>> al = new ArrayList<>();

        for(int i = 0; i < words.length; i++)
        {
            al.add(new HashMap<>());
        }

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];

            for(char ch : word.toCharArray())
            {
                String s = String.valueOf(ch);
                al.get(i).put(s, al.get(i).getOrDefault(s, 0) + 1);
            }
        }

        List<String> ans = new ArrayList<>();

        for(String key : al.get(0).keySet())
        {
            int min = al.get(0).get(key);

            for(int i = 1; i < words.length; i++)
            {
                min = Math.min(min, al.get(i).getOrDefault(key, 0));
            }

            for(int j = 0; j < min; j++)
            {
                ans.add(key);
            }
        }

        return ans;
    }
}
