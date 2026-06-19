class Solution {
    public int largestAltitude(int[] gain) 
    {
        int res;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        for(int i=0;i<gain.length;i++)
        {
            arr.add(gain[i]+arr.get(arr.size()-1));
        }
        res=Collections.max(arr);
        return res;
    }
}