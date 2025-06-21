class Solution {
    public boolean isPalindrome(String s) 
    {
        String clean="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch >= 'A' && ch<='Z')
            {
                ch = (char)(ch+32);
            }

            if(ch>='a' && ch<='z' || ch>='0' && ch<= '9')
            {
                clean+=ch;
            }
        }
        int start = 0;
        int end = clean.length()-1;

        while(start<end)
        {
            if(clean.charAt(start)!=clean.charAt(end))
            {
                return false;
                
            }
            start++;
            end--;
        }
        return true;
    }
}