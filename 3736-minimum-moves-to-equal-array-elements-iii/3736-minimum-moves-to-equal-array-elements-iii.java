class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE,count=0;
        for(int n:nums)
           if(n>max)
              max=n;
        for(int n:nums){
            count+=max-n;
        }
        return count;
    }
}