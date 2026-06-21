class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        int[] arr = new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;

        double res=0;
        
        
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<=nums2[j])
            {
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length)
        {
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length)
        {
            arr[k]=nums2[j];
            k++;
            j++;
        }
        if(arr.length%2==0)
        {
            int s=arr.length/2;
            res=(double)(arr[s]+arr[s-1])/2;
        }
        else
        {
             int s=arr.length/2;
             res=arr[s];
        }
        return res;
    }

}