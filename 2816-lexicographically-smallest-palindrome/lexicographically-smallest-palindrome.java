class Solution {
    public String makeSmallestPalindrome(String s) 
    {
        int left=0;
        int right=s.length()-1;
        String s3="";

        char[] ch = s.toCharArray();
        while(left<right)
        {
            if(ch[left]==ch[right])
            {

            }
            else
            {
                if(ch[left]>=
                ch[right]){
                    ch[left]=ch[right];
                }
                else{
                    ch[right]=ch[left];
                }
            }   
            left++;
            right--;
        } 
         for(char s1 : ch)
            {
                s3+=s1;
            }
        return s3;
    }
}