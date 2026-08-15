class Solution 
{
    ArrayList<Double> al = new ArrayList<>();
    public void getAvg(int num1,int num2)
    {
        double avg = (num1+num2) / 2.0;
        al.add(avg);
    }
    public double minimumAverage(int[] nums) 
    {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;

        while(left<right)
        {
            getAvg(nums[left],nums[right]);
            left++;
            right--;
        }
        return Collections.min(al);
    }
      
      
}