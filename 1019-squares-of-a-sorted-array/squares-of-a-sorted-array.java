class Solution {
    public int[] sortedSquares(int[] nums) 
    {
        int n = nums.length;
        int low=0;
        int high=n-1;
        int pos=n-1;

        int sortArray[] = new int[n];

        while(low<=high)
        {
            int left=nums[low]*nums[low];
            int right=nums[high]*nums[high];

            if(left>right)
            {
                sortArray[pos]=left;
                low++;
            }
            else
            {
                sortArray[pos]=right;
                high--;
            }
            pos--;
        }
        return sortArray;
    }
    
}