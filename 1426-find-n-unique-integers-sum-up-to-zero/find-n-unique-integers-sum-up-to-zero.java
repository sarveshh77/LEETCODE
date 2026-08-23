import java.util.*;

class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (al.size() == n - 1) {
                al.add(0);
                break;
            } else {
                al.add(i);
                al.add(-i);
            }
        }

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = al.get(i);
        }

        return ans;
    }
}