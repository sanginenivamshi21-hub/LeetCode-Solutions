class Solution {
    public void sortColors(int[] nums) {
        int zeroes=0,ones=0,twoes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zeroes++;
            if(nums[i]==1)
                ones++;
            if(nums[i]==2)
                twoes++;
        }
        int index = 0;

for (int i = 0; i < zeroes; i++)
    nums[index++] = 0;

for (int i = 0; i < ones; i++)
    nums[index++] = 1;

for (int i = 0; i < twoes; i++)
    nums[index++] = 2;
    }
}