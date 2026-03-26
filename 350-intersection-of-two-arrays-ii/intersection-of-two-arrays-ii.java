class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums1) 
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(int i = 0; i < nums2.length; i++) {
            int current = nums2[i];
            if(map.containsKey(current) && map.get(current) > 0) 
            {
                resultList.add(current);
                map.put(current, map.get(current) - 1);
            }
        }

        int[] finalResult = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++) 
        {
            finalResult[i] = resultList.get(i);
        }
        return finalResult;
    }
}