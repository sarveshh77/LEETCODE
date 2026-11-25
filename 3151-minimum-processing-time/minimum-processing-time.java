class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) 
    {
        int k = 0;
        int max1 = Integer.MIN_VALUE;
        int sum = 0;
        Collections.sort(processorTime);
        Collections.sort(tasks,Collections.reverseOrder());

        System.out.println(tasks);
        System.out.println(processorTime);

        for(int i = 0; i < tasks.size(); i+=4)
        {
            sum = processorTime.get(k++) + tasks.get(i);
            
            max1 = Math.max(sum,max1);
        }
        return max1;
    }
}