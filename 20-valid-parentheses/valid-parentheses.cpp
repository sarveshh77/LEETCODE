class Solution {
public:

    bool isClosed(char c)
    {
        return (c == ')' || c == ']' || c == '}');
    }
    bool isValid(string s) {
        int n = s.size();
        if(n == 1) return false;
        stack<char> st;

        st.push(s[0]);
        char c;
        for(int i = 1; i < n; i++)
        {
            c = s[i];
            
            // if(st.empty()) break;
            char nec = (!st.empty()) ? st.top() : c;

            bool popped = false;

            if(nec == '(' and c == ')')
            {st.pop();
            popped = true;}
            else if(nec == '[' and c == ']')
            {st.pop();
            popped = true;}
            else if(nec == '{' and c == '}')
            {st.pop();
            popped = true;}

            if(popped)
            continue;

            st.push(c);
            

        }

        if(!st.empty()) return false;

        return true;
    }
};