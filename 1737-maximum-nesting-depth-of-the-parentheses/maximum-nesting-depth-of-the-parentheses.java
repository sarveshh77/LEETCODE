class Solution {
    public int maxDepth(String s) 
    {
        int currCount=0;
        int maxCount=0;
      Stack<Character> stack = new Stack<>();
      for(char ch : s.toCharArray())
      {
        if(ch=='(')
        {
            stack.push(ch);
            currCount++;
        if(currCount>maxCount)
        {
            maxCount=currCount;
        }
        }
        if(ch==')')
        {
            stack.pop();
            currCount--;
        }
      }
      return maxCount;
    }
}