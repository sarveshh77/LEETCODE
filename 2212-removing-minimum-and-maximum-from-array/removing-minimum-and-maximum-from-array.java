class Solution {
    public int minimumDeletions(int[] nums) {
       int max1=Integer.MIN_VALUE;
       int min1=Integer.MAX_VALUE;

       for(int i=0;i<nums.length;i++){
        max1=Math.max(nums[i],max1);
        min1=Math.min(nums[i],min1);
       } 

       int del=Integer.MAX_VALUE;
        int j=0;
        int t1=0;
        boolean flag=false;
       for(int i=0;i<nums.length;i++){
        if(min1==nums[i] || max1==nums[i]){
            j=i+1;

            if(!flag){
                t1=i+1;
                flag=true;
            }


        }
       } 
       int t2=0;
         flag=false;

       del=Math.min(del,j);
       for(int i=nums.length-1; i>=0;i-- ){   
         if(min1==nums[i] || max1==nums[i]){
            j=(nums.length-i);
            if(!flag){
                t2=(nums.length-i);
                flag=true;
            }
         }  
       }
         del=Math.min(del,j);
         System.out.println(t1+""+t2);

           del=Math.min(del,t1+t2);

           return del;

    }
}