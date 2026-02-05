class Solution {
public:
    
    int climbStairs(int n) {
        int res = 0;
       int prev = 0;
       int curr = 1;

       for(int i = 0; i < n; i++)
       {
        res = curr + prev;

        prev = curr;
        curr = res;
       }

       return res;
    }
};