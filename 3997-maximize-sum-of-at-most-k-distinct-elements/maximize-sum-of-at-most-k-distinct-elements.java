class Solution {
    public int[] maxKDistinct(int[] nums, int k) 
    {
        HashSet<Integer> hs = new HashSet<>();
        
       
        ArrayList<Integer> al = new ArrayList<>();
        for(int num:nums)
        {
            hs.add(num);
        }
        

       while(hs.size()>0 && k>0)
       {
           int max = Collections.max(hs);
           hs.remove(max);
           al.add(max);

           k--;
       }
        int[] newArr = new int[al.size()];
       for(int i=0;i<al.size();i++)
       {
          newArr[i]=al.get(i);
       }
       return newArr;
    }
}