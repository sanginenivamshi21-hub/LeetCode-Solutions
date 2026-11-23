class Solution {
    public int triangularSum(int[] nums) {
        int iterations=nums.length,count=0;
        int n=iterations-1;
        while(count<iterations){
            for(int i=0;i<n;i++){
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            count++;
            n--;
        }
        return nums[0];
    }
}