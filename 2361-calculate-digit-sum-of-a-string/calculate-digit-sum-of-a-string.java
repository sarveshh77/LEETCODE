class Solution 
{
    public String digitSum(String s, int k)
    {
        StringBuilder sb = new StringBuilder();
        int i=0;
        int sum=0;
        int temp=k;
        while(s.length()>k)
        {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));   
            temp--;

                if(i==s.length()-1)
                {
                    sb.append(sum);
                    sum=0;
                    temp=k;
                    s=sb.toString();
                        sb.setLength(0);
                    i=0;
                    continue;
                }
                else if(temp==0)
                {
                    sb.append(sum);
                    sum=0;
                    temp=k;
                }

        i++;
        }
        return s;
    }
}