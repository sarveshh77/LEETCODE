class Solution {
    public int[] diStringMatch(String s) 
    {
       int smallest = 0;
       int largest=s.length();
       int[] newS= new int[s.length()+1]; 
       for(int i=0;i<s.length();i++)
       {
         if(s.charAt(i)=='I')
         {
            newS[i]=smallest;
            smallest++;
         }
         else
         {
            newS[i]=largest;
            largest--;
         }
       }
       newS[s.length()]=smallest;
       return newS;
    }
}