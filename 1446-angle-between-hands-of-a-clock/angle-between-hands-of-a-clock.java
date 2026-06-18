class Solution {
    public double angleClock(int hour, int minutes) {
        double res= (double)Math.abs(30*hour-5.5*minutes);
        if(res>180){
            res=360-res;
        }
        return res;
        
    }
}