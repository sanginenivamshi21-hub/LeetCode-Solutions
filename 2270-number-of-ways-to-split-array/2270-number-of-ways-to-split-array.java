class Solution {
    public int waysToSplitArray(int[] nums) {
        long total=0,leftSum=0;int count=0;
       for (int n:nums){
        total+=n;
       } 
       long rightSum=total;
       for(int i=0;i<nums.length-1;i++){
        leftSum +=nums[i];
        rightSum-=nums[i];
        if(leftSum>=rightSum)
           count++;
       }
       return count;
    }
}