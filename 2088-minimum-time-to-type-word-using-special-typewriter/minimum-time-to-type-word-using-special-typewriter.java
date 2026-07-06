class Solution {
    public int minTimeToType(String word) {

        int time = 0;
        char current = 'a';

        for (char target : word.toCharArray()) {

            int diff = Math.abs(current - target);

            time += Math.min(diff, 26 - diff);

            time++; 

            current = target;
        }

        return time;
    }
}