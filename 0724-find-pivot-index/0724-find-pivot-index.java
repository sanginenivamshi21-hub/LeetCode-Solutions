class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0,rightSum=0;
        for (int i=0;i<nums.length;i++)
            rightSum +=nums[i];
        for (int i=0;i<nums.length;i++){
            int pivot=i;
            rightSum -=nums[pivot];
            if (leftSum==rightSum)
                return pivot;
            else{
                leftSum +=nums[pivot];
            }
        }
        return -1;
    }
}