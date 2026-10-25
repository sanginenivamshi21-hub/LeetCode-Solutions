class Solution {
    public int maximumCount(int[] nums) {
        int start=0,end=nums.length-1,mid=0,posNums=0,negNums=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid<end && nums[mid]<0 && nums[mid+1]>=0)
               break;
            if(nums[mid]<0)
                start=mid+1;
            else
                end=mid-1;
        }
        if(nums[mid]>=0)
            negNums=0;
        else
            negNums=mid+1;
        end=nums.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid>start && nums[mid-1]<=0 && nums[mid]>0)
               break;
            if(nums[mid]>0)
                end=mid-1;
            else
                start=mid+1;
        }
        if(nums[mid]<=0)
            posNums=0;
        else
            posNums=nums.length-mid;
        return posNums>=negNums?posNums:negNums;
    }
}