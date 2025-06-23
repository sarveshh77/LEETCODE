class Solution {
    public int lengthOfLastWord(String s) 
    {
        int count =0;
        String str2 = s.trim();

        for(int i=str2.length()-1;i>=0;i--)
        {
            if(str2.charAt(i)==' ')
            {
                break;
            }
            count+=1;
        }
        return count;
    }
}