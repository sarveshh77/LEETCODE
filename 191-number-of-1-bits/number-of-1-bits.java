class Solution {
    public int hammingWeight(int n) 
    {  
        int sum=0;
        String binary = Integer.toBinaryString(n);
        // System.out.println(binary);
        
        for(char c : binary.toCharArray())
        {
            if(c=='1')
            {
                sum++;
            }
        }
        return sum;
    }
}