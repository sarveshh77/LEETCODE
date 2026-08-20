class Solution {
    public int[] resultArray(int[] nums) 
    {
        // int[] arr1 = new int[nums.length];
        // int[] arr2 = new int[nums.length];

        int[] ans = new int[nums.length];

        ArrayList<Integer> al1= new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        
      
        al1.add(0,nums[0]);
        al2.add(0,nums[1]);
       
        for(int i=2;i<nums.length;i++)
        {
            if(al1.get(al1.size()-1)>al2.get(al2.size()-1))
            {
                al1.add(nums[i]);
            }
            else
            {
                al2.add(nums[i]);
            }
        }
        al1.addAll(al2);

         for(int i=0;i<al1.size();i++)
         {
             ans[i]=al1.get(i);
         }
         return ans;
    }
}