class Solution {
    public int countGoodSubstrings(String s) 
    {
       int n =s.length();
       int count=0;

       for(int i=0;i+2<n;i++)
       {
         char a = s.charAt(i);
          char b = s.charAt(i+1);
           char c = s.charAt(i+2);

           if(a!=b && b!=c && a!=c)
           {
            count++;
           }
       }
       return count;   
    }
}