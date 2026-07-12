class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) 
    {
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
                al.add(i);
            }
        }
        return al;
    }
}