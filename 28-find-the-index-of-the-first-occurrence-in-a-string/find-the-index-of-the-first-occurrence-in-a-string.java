class Solution {
    public int strStr(String haystack, String needle) 
    {
        int hayLen = haystack.length();
        int needLen = needle.length();

        for(int i=0;i<=hayLen-needLen;i++)
        {
            boolean match =true;

            for(int j=0;j<needLen;j++)
            {
                if(haystack.charAt(i+j)!=needle.charAt(j))
                {
                    match = false;
                    break;
                }
            }
            if(match)
            {
                return i;
            }
        }
        return -1;
    }
}