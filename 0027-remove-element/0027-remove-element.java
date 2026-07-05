class Solution {
    public int removeElement(int[] nums, int val) {
        int start=0;
     for (int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            swap(nums,start,i);
            start++;
        }
      }
      return start;
    }
    void swap(int[] nums,int start,int i){
        int temp=nums[start];
        nums[start]=nums[i];
        nums[i]=temp;
    }
}