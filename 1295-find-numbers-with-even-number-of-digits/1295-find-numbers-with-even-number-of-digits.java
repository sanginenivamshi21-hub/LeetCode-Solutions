class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int j=0;j<nums.length;j++){
            if((int)(Math.log10(nums[j])+1)%2==0)
               count++;
        }
        return count;
    }
}