class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums1) {
            hs.add(num);
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        
        for(int i = 0; i < nums2.length; i++) 
        {
            if(hs.contains(nums2[i])) {
                resultList.add(nums2[i]);
                hs.remove(nums2[i]);
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