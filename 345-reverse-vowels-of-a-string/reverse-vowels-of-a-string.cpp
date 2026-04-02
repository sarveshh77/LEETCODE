class Solution {
public:
    bool isVowel(char c) {
        c = toupper(c);
        return c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }

    string reverseVowels(string s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            while(left < right && !isVowel(s[left])) {
                left++;
            }
            while(left < right && !isVowel(s[right])) {
                right--;
            }

            swap(s[left], s[right]);
            left++;
            right--;
        }
        return s;
    }
};