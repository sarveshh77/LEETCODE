class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, sum = 0;
        int[] freq = new int[nums.length + 1];
        freq[0] = 1;

        for (int num : nums) {
            sum += num % 2;
            if (sum >= k) {
                count += freq[sum - k];
            }
            freq[sum]++;
        }

        return count;
    }
}
