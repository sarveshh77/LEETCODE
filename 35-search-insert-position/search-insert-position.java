class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        ArrayList<Integer> al = new ArrayList();
        for(int num : nums)
        {
            al.add(num);
        }
        if(al.contains(target))
        {
            int index = al.indexOf(target);
            return index;
        }
        else
        {
            al.add(target);
            Collections.sort(al);

           return al.indexOf(target);
        }


    }
}