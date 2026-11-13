class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            if(!isExist(nums1[i],nums2))
                if(!ans.get(0).contains(nums1[i]))
                    ans.get(0).add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!isExist(nums2[i],nums1))
                if(!ans.get(1).contains(nums2[i]))
                    ans.get(1).add(nums2[i]);
        }
        return ans;
    }
    boolean isExist(int key,int[] nums){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==key)
                return true;
            else if(nums[mid]<key)
                start=mid+1;
            else
                end=mid-1;
        }
        return false;
    }
}