import java.util.*;

class Solution {
    public int[] frequencySort(int[] nums) 
    {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        numList.sort((a, b) -> {
            int freqA = hashMap.get(a);
            int freqB = hashMap.get(b);
            if (freqA != freqB) {
                return freqA - freqB; 
            } 
            else 
            {
                return b - a; 
            }
        });
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = numList.get(i);
        }

        return result;
    }
}
