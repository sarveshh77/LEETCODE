class Solution {
    public long gcdSum(int[] nums) 
    {
        long sum=0;
        int[] prefixGcd = new int[nums.length];
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            max= Math.max(max,nums[i]);
            prefixGcd[i]=gcd(max,nums[i]);
        }
        int i=0;
        int j=nums.length-1;
        Arrays.sort(prefixGcd);
        while(i<j)
        {
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a,int b)
    {
       while (b!=0) 
       {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}