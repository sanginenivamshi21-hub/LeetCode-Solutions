class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int start=0,end=nums.length-1;
        while(start<=end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
        start=0;
        end=k-1;
        while(start<=end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
        start=k;
        end=nums.length-1;
        while(start<=end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
}