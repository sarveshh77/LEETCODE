class Solution {
    public String findLongestWord(String s, List<String> dictionary) 
    {
        Collections.sort(dictionary);
        String ans="";

        for(int i = 0; i<dictionary.size(); i++)
        {
            int left = 0;
            int right = 0;

            String word = dictionary.get(i);

            while(left < s.length() && right < word.length())
            {
                if(s.charAt(left) == word.charAt(right))
                {
                    left++;
                    right++;
                }
                else
                {
                    left++;
                }
            }
            if(right == word.length() && word.length() > ans.length())
            {
                ans = word;
            }
        }
        return ans;
    }
}