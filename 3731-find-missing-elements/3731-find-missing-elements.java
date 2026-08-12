class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0],max=nums[nums.length-1],count=1;
        List<Integer> ans=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(i==nums[count] && count<nums.length){
                count++;
            }
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}