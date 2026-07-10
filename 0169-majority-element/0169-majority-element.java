class Solution {
    public int majorityElement(int[] nums) {
        for (int i=0;i<nums.length;i++){
            int key=nums[i];
            int count = 1;
            int j=i+1;
            while(j<nums.length){
                if (nums[j]==nums[i])
                    count++;
                j++;
            }
            if (count>nums.length/2)
                return nums[i];
        }
        return -1;
    }
}