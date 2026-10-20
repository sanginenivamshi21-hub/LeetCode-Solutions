class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int start=0,end=nums.length-1,count=0;
        for(int i=1;i<end;i++){
            if(nums[i]==nums[start] || nums[i]==nums[end])
                continue;
            else
                count++;
        }
        return count;
    }
}