class Solution {
    public boolean isPalindrome(String s) 
    {
        String s1=s.toLowerCase();
        String str1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        int low=0;
        int high=str1.length()-1;

        while(low<high)
        {
            if(str1.charAt(low)!=str1.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;

        
    }
}