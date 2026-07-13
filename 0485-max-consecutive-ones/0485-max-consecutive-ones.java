class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for (int n:nums){
            if (n==0) count=0;
            count +=n;
            if(count>max)
                max=count;
        }
        return max;
    }
}