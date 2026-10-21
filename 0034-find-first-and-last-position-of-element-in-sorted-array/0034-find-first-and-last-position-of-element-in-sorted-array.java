class Solution {
    public int[] searchRange(int[] nums, int target) {
            int firstOccurrence=binarySearch(nums,0,nums.length-1,target,false);
            if (firstOccurrence==-1)
                return new int[]{-1,-1};
            int lastOccurrence=binarySearch(nums,firstOccurrence,nums.length-1,target,true);
            return new int[]{firstOccurrence,lastOccurrence};
    }
    int binarySearch(int[] nums,int start,int end,int target,boolean isLeftOne){
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid])
                end=mid-1;
            else if(target>nums[mid])
                start=mid+1;
            else{
                ans=mid;
                if(!isLeftOne)
                   end=mid-1;
                else
                   start=mid+1;
            }
        }
        return ans;
    }
}