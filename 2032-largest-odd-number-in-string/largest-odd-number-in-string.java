class Solution {
    public String largestOddNumber(String num) 
    {
      String str2="";
      for(int i=0;i<num.length();i++)
      {
        char ch = num.charAt(i);
        if((ch-'0')%2 != 0)
        {
            str2=num.substring(0,i+1);
        }
      }
      return str2;
    }
}