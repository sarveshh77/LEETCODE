import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int target = -nums[i];
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int j = i + 1; j < nums.length; j++) {
                int diff = target - nums[j];

                if (hm.containsKey(diff)) {
                    List<Integer> triplet = Arrays.asList(nums[i], diff, nums[j]);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
                hm.put(nums[j], j);
            }
        }

        return new ArrayList<>(result);
    }
}
