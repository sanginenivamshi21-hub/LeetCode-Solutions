class Solution {
    public int[] leftRightDifference(int[] nums) {
        long leftSum=0,max=0;
        int[] ans=new int[nums.length];
        for(int n:nums){
            max+=n;
        }
        long rightSum=max;
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            ans[i]=(int)Math.abs(leftSum-rightSum);
            leftSum+=nums[i];
        }
        return ans;
    }
}