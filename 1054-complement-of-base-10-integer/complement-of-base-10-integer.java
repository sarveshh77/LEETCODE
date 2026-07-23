class Solution {
    public int bitwiseComplement(int n) 
    {
       StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
       for (int i = 0; i < sb.length(); i++)
       {
          if(sb.charAt(i) == '0')
          {
             sb.setCharAt(i,'1');
          }
          else
          {
              sb.setCharAt(i,'0');
          }
       }
       String s = new String(sb);
       return Integer.parseInt(s,2);
    }
}