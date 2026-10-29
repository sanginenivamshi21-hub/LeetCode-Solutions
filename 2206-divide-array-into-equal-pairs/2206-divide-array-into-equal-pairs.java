class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0) return false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i=i+2){
            if(nums[i]!=nums[i-1])
               return false;
        }
        return true;
    }
}