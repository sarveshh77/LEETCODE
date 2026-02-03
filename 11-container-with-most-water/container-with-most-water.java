class Solution {
    public int maxArea(int[] height)
    {
        int lp=0;
        int rp=height.length-1;
        int maxWater=0;
        while(lp<rp)
        {
            int width=rp-lp;
            int h=Math.min(height[lp],height[rp]);
            int currWater=width*h;
            maxWater=Math.max(currWater,maxWater);

        if (height[lp] < height[rp]) 
        {
                  lp++;
        }   
        else
        {
                  rp--;
        }
        }
        return maxWater;
    }
}