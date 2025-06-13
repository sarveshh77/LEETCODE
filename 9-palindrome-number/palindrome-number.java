class Solution {
    public boolean isPalindrome(int x) 
    {
        
        int temp=x;
        int lastDigit;
        int rev=0;

        while(x>0)
        {
            lastDigit=x%10;
            rev=(rev*10)+lastDigit;
            x=x/10;
        }
        if(rev==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
//Done