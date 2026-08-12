class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for (int i=min+1;i<max;i++){
            if(binarySearch(nums,0,nums.length-1,i)==-1)
                ans.add(i);
        }
        return ans;
    }
    int binarySearch(int[] nums,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==target)
                return mid;
            else if (nums[mid]>target)
                end=mid-1;
            else
                start=mid+1;  
        }
        return -1;
    }
}