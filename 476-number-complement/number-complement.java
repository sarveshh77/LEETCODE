class Solution {
    public int findComplement(int num)
    {
        char[] comp = Integer.toBinaryString(num).toCharArray();

        for (int i=0;i<comp.length;i++)
        {
            if(comp[i]=='1')
            {
                comp[i]='0';
            }
            else
            {
                comp[i]='1';
            }
        }
     String s = new String(comp);
     return Integer.parseInt(s,2);
    }
}