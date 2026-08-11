class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int res=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:divisors){
            int count=0;
            for(int j:nums){
                if(j%i==0) count++;
            }
            if (count>max){
                max=count;
                res=i;
            }
            else if(count==max && i<res)
                res=i;
        }
        return res;
    }
}