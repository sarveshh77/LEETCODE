class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        int left = 0;

        while (left < chars.length) {
            int right = left;

            
            while (right < chars.length && chars[right] != ' ') {
                right++;
            }
            int start = left;
            int end = right - 1;

            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                start++;
                end--;
            }
            left = right + 1;
        }

        return new String(chars);
    }
}