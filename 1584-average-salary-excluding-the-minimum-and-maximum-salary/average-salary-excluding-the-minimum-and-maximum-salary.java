class Solution {
    public double average(int[] salary)
    {
        Arrays.sort(salary);

        double sum=0;
        int count=0;
        int start = 1;
        int end = salary.length-2;

        for(int i=start;i<=end;i++)
        {
            sum+=salary[i];
            count++;
        }
        return (double)sum/count;
    }
}