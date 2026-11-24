class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) 
    {
        ArrayList<List<Integer>> al2 = new ArrayList<>();
        int abs = 0;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++)
        {
            abs = Math.abs(arr[i+1] - arr[i]);
            min = Math.min(abs,min);
        }
        for(int i = 0; i < arr.length - 1; i++)
        {
            ArrayList<Integer> al = new ArrayList<>();
            if(arr[i+1] - arr[i] == min)
            {
                al.add(arr[i]);
                al.add(arr[i+1]);

                al2.add(al);
            }
            
        }
       
        return al2;

    }
}