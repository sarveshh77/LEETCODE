class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        int[] copyArr=arr.clone();
        Arrays.sort(copyArr);

        int rank=1;
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int num:copyArr)
        {
            if(!hm.containsKey(num))
            {
                hm.put(num,rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            int val=hm.get(arr[i]);
            arr[i]=val;
        }
        return arr;
    }
}