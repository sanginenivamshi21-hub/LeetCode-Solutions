class Solution {
    public int findMiddleIndex(int[] nums) {
        int leftSum=0,max=0;
        for(int n:nums){
            max+=n;
        }
        int rightSum=max;
        for(int i=0;i<nums.length;i++){
            rightSum-=nums[i];
            if(leftSum==rightSum)
               return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}