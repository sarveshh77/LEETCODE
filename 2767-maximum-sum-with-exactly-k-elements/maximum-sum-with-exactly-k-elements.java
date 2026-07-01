class Solution {
    public int maximizeSum(int[] nums, int k) 
    {
        int sum=0;
        Arrays.sort(nums);
       ArrayList<Integer> al = new ArrayList<>();
        while(k>0)
        {
            al.add(nums[nums.length-1]);
            nums[nums.length-1]=nums[nums.length-1]+1;
            k--;
        }
        for(int num:al)
        {
            sum+=num;
        }
        return sum;
    }
}