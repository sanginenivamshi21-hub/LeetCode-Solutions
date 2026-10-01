class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int res=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int j:divisors){
            int count=0;
            for(int k:nums){
                if(k%j==0) count++;
            }
            if (count>max){
                max=count;
                res=j;
            }
            else if(count==max && j<res)
                res=j;
        }
        return res;
    }
}