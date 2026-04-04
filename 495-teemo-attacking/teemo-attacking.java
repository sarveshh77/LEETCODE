class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) 
    {
        
        if (timeSeries.length == 0) return 0;

        int totalSeconds = 0;

      
        for (int i = 0; i < timeSeries.length - 1; i++)
         {
            int gap = timeSeries[i + 1] - timeSeries[i];
            
      
            if (gap < duration) {
                totalSeconds += gap;
            }
             else 
            {
                totalSeconds += duration;
            }
        }

       
        totalSeconds += duration;

        return totalSeconds;
    }
}