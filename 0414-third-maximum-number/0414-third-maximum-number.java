class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count=1,i;
        int max=nums.length-1;
        if (nums.length<=2) return nums[nums.length-1];
        for(i=nums.length-2;i>=0;i--){
            if(nums[max]!=nums[i]){
                max=i;
                count++;
            }
            if (count == 3)
               return nums[i];
        }
        return nums[nums.length-1];
    }
}