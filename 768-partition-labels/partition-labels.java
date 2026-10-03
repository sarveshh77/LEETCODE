class Solution {
    public List<Integer> partitionLabels(String s) 
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        int start = 0;
        int end = 0;

        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),i);
        } 
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int lastIndex=hm.get(ch);

            end = Math.max(end, lastIndex);

            if (i == end) 
            {
                al.add(end - start + 1);
                start = i + 1;
            }
        }

        return al;
        }
    }