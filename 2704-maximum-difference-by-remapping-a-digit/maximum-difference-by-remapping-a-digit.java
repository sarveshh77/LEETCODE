class Solution {
    public int minMaxDifference(int num) {

        String s = String.valueOf(num);

        char a = '0';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '9') {
                a = s.charAt(i);
                break;
            }
        }

        char b = s.charAt(0);

        int max = Integer.parseInt(s.replace(a, '9'));
        int min = Integer.parseInt(s.replace(b, '0'));

        return max - min;
    }
}