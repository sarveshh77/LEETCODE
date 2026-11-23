class Solution {
    public int passwordStrength(String password) 
    {
        HashSet<Character> hs = new HashSet<>();
        int points = 0;

        for(char ch : password.toCharArray())
        {
            hs.add(ch);
        }
        for(char ch : hs)
        {

               if(ch >= 'a' && ch <= 'z')
                {
                    points += 1;
                }
                else if(ch >= 'A' && ch <= 'Z')
                {
                    points += 2;
                }
                else if(ch >= '0' && ch <= '9')
                {
                    points += 3;
                }
                else if("!@#$".indexOf(ch) != -1)
                {
                    points += 5;
                }
        }
        return points;
    }
}