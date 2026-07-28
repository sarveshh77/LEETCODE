class Solution {
    public String[] sortPeople(String[] names, int[] heights)
    {
        HashMap<Integer,String> hm = new HashMap<>();
        String namesSorted[] = new String[names.length];


        for (int i = 0; i < heights.length; i++) 
        {
            hm.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        int idx=0;
        for(int i=heights.length-1;i>=0;i--)
        {
            namesSorted[idx++]=hm.get(heights[i]);
        }
        // System.out.println(hm);
        return namesSorted;
    }
}