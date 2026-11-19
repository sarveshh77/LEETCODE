class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {

            if (asteroids[i] > 0) {
                st.push(asteroids[i]);
            } 
            else {

                boolean alive = true;

                while (!st.isEmpty() && st.peek() > 0) {

                    if (Math.abs(asteroids[i]) > st.peek()) {
                        st.pop();
                    }
                    else if (Math.abs(asteroids[i]) == st.peek()) {
                        st.pop();
                        alive = false;
                        break;
                    }
                    else {
                        alive = false;
                        break;
                    }
                }

                if (alive) {
                    st.push(asteroids[i]);
                }
            }
        }
        int[] result = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }
}