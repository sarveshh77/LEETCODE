class Solution {
    public int countCharacters(String[] words, String chars) 
    {
        int sum=0;

        for(int s =0;s<words.length;s++)
        {
            StringBuilder temp = new StringBuilder(chars);
            boolean key=true;
            char[] s1 = words[s].toCharArray();
            for(char c : s1)
            {
               int index=temp.indexOf(String.valueOf(c));
               if(index==-1){
                key=false;
                break;
               }
               temp.deleteCharAt(index);
            }
            if(key==true)
            {
                sum+=s1.length;
            }
        }
        return sum;
    }
}