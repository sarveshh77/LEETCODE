class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        // String s1=new String(c1);
        // String t1=new String(c2);

        // System.out.println(s1+" "+t1);

        for (int i = 0; i < c1.length; i++) 
        {
            if (c1[i] != c2[i]) 
            {
                return c2[i];
            }
        }
        return c2[c2.length - 1];

    }
}