class Solution {
    public boolean judgeCircle(String moves) 
    {
        int count=0;
        int count1=0;

        for(char c=0;c<moves.length();c++)
        {
            if(moves.charAt(c)=='U')
            {
                count++;
            }
            else if(moves.charAt(c)=='D')
            {
                count--;
            }
            else if(moves.charAt(c)=='L')
            {
                count1++;
            }
            else
            {
                count1--;
            }
         }
         if(count==0 && count1==0)
         {
            return true;
         }
         else
         {
            return false;
         }
    }
}