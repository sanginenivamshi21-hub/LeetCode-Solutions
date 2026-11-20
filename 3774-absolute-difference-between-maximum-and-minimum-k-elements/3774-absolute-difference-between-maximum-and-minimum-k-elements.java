class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int leftSum=0,rightSum=0;
        int l=nums.length-1;
        for(int i=0;i<k;i++){
            rightSum +=nums[l];
            l--;
            leftSum +=nums[i];
        }
        return (int)Math.abs(rightSum-leftSum);
    }
}