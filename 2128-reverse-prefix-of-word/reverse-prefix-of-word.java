class Solution {
    public String reversePrefix(String word, char ch) 
    {

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        boolean b=false;
        for(char c : word.toCharArray())
        {
            if(b)
            {
                sb.append(c);
            }
            else if(c!=(ch))
            {
                st.push(c);
            }
            else if(c==(ch))
            {
                sb.append(ch);
                while(!st.isEmpty())
                {
                    sb.append(st.pop());
                }
                b=true;
            }
        }
        if(!b)
        {
            return word;
        }
        return sb.toString();
    }
}