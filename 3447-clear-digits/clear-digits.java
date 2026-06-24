class Solution 
{
    public String clearDigits(String s)
    {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
       for(char c : s.toCharArray())
       {
          if(!Character.isDigit(c))
          {
            st.push(c);
          }
          else
          {
            st.pop();
          }
       }
    while(!st.isEmpty())
    {
       sb.append(st.pop());
    }
    return sb.reverse().toString();
    }
}