class Solution {
    public int[] countBits(int n) 
    {
        int[] newArr=new int[n+1];

        for(int i=0;i<=n;i++)
        {
            String binary = Integer.toBinaryString(i);
            int count=0;
            for(char c:binary.toCharArray())
            {         
                if(c=='1')
                {
                    count++;
                }
            }
            newArr[i]=count;
        }
        return newArr;
      
    }
}