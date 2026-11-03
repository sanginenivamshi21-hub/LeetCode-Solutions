class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> sums=new HashSet<>();
        int partialSum=0;
        for(int i=1;i<nums.length;i++){
            partialSum=nums[i]+nums[i-1];
            if(sums.contains(partialSum))
               return true;
            else
               sums.add(partialSum);
        }
        return false;
    }
}