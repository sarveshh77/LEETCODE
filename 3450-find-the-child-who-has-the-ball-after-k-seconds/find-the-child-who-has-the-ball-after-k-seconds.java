class Solution {
    public int numberOfChild(int n, int k) {

        int current = 0;
        int direction = 1;

        while (k > 0) {

            current += direction;

            if (current == n - 1 || current == 0) {
                direction *= -1;
            }

            k--;
        }

        return current;
    }
}