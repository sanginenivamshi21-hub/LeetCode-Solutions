class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for (int k=0;k<nums.length-2;k++){
            if(nums[k]>0) break;
            if(k>0 && nums[k-1]==nums[k]){
                continue;
            }
            int val=-nums[k];
            int i=k+1,j=nums.length-1;
            while(i<j){  
                if(nums[i]+nums[j]<val)
                    i++;
                else if(nums[i]+nums[j]>val)
                    j--;
                else{
                    List<Integer> list = List.of(nums[k],nums[i],nums[j]);
                    i++;
                    j--;
                    while(i<j && nums[i]==nums[i-1]){
                        i++;
                    }
                    while(i<j && nums[j]==nums[j+1]){
                        j--;
                    }
                    res.add(list);
                }
            }
        }
        return res;
    }
}