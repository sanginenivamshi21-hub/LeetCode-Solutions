class Solution {
    public int minimumAverageDifference(int[] nums) {
        long max=0,leftSum=0;
        int ans=0;
        long min=Long.MAX_VALUE;
        for(int n:nums)
           max+=n;
        if (max==0) return 0;
        long rightSum=max;
        long temp=0;
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            leftSum+=nums[i];
            if(i==nums.length-1)
                temp=Math.abs(leftSum/(i+1));
            else
                temp=Math.abs((leftSum/(i+1))-(rightSum/(nums.length-i-1)));
            if(temp<min){
                min=temp;
                ans=i;
            }
        }
        return ans;
    }
}