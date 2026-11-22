class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
       for(int n:nums){
        if(n>max)
            max=n;
        if(n<min)
            min=n;
       } 
       for(int i=min;i>1;i--){
        if (max%i==0 && min%i==0)
            return i;
       }
       return 1;
    }
}