class Solution {
    public double trimMean(int[] arr) 
    {
        int count=0;
        int remove = arr.length*5/100;
        int sum=0;

        Arrays.sort(arr);

        for(int i=remove;i<arr.length-remove;i++)
        {
            sum+=arr[i];
            count++;
        }
        return (double) sum/count;
    }
}