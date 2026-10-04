class Solution 
{
    public boolean winnerOfGame(String colors)
    {
        int alice=0;
        int bob=0;
        int count=1;

        for(int i=1;i<colors.length();i++)
        {
            if(colors.charAt(i)==colors.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(colors.charAt(i-1)=='A')
                {
                    alice+=Math.max(0,count-2);
                }
                else
                {
                    bob+=Math.max(0,count-2);
                }
                count=1;
            }
        }

        if(colors.charAt(colors.length()-1)=='A')
        {
            alice+=Math.max(0,count-2);
        }
        else
        {
            bob+=Math.max(0,count-2);
        }

        return alice>bob;
    }
}