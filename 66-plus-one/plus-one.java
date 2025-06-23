/*class Solution {
    public int[] plusOne(int[] digits) 
    {
        int n=0;
        for(int i=0;i<digits.length;i++)
        {
            n=n*10+digits[i];
        }
        n=n+1;

        String numString = Integer.toString(n);
        int arr[] = new int[numString.length()];

        for(int i=0;i<numString.length();i++)
        {
            arr[i] = numString.charAt(i) - '0';
        }
        return arr;

    }
}*/

class Solution {
    public int[] plusOne(int[] digits) 
    {
        int len = digits.length;

        for(int i= len-1;i>=0;i--)
        {
           if(digits[i]<9)
           { 
            digits[i]++;
            return digits;
           }
           digits[i]=0;

        }

        int result[] = new int[len+1];
        result[0]=1;
        return result;
    }
}
