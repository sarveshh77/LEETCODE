class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        List<Integer> result = new ArrayList<>();
        int len = m+n;

        int i=0;
        int j=0;

        int nums1Len=m;
        int nums2Len=n;

        while(i<nums1Len && j<nums2Len)
        {
            if(nums1[i]<=nums2[j])
            {
                result.add(nums1[i]);
                i++;
            }
            else
            {
                result.add(nums2[j]);
                j++;
            }
        }
      while(i<nums1Len)
      {
        result.add(nums1[i]);
        i++;
      }
      while(j<nums2Len)
      {
        result.add(nums2[j]);
        j++;
      }
      for (int k = 0; k < m + n; k++) 
       {
            nums1[k] = result.get(k);
        }
    }
}

