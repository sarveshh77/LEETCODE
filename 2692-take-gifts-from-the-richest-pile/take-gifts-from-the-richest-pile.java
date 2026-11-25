class Solution {
    public long pickGifts(int[] gifts, int k) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        long sum = 0;

        for(int num : gifts)
        {
            pq.offer(num);
        }
        for(int i = 0; i<k; i++)
        {
            int max1 = pq.poll();
            int newOne = (int) Math.sqrt(max1);
            pq.offer(newOne);
        }
        while(!pq.isEmpty())
        {
            sum+= pq.poll(); 
        }
        return sum;
    }
}