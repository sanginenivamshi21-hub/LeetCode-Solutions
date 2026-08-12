class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        List<Integer> ans=new ArrayList<>();
        for(int i:nums){
            if(i<min)
               min=i;
            if(i>max)
               max=i;
        }
        Arrays.sort(nums);
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