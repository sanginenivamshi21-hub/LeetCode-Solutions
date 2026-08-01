class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        if (nums[0]>0) return res;
        for (int k=0;k<nums.length-2;k++){
            if(k>0 && nums[k-1]==nums[k]){
                continue;
            }
            int val=-nums[k];
            int i=k+1,j=nums.length-1;
            while(i<j){  
                List<Integer> list=new ArrayList<>();
                if(nums[i]+nums[j]<val)
                    i++;
                else if(nums[i]+nums[j]>val)
                    j--;
                else{
                    list.add(nums[k]);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    int x=i,y=j;
                    while(i<nums.length && nums[x]==nums[i])
                        i++;
                    while(j>0 && nums[y]==nums[j])
                        j--;
                    res.add(list);
                }
            }
        }
        return res;
    }
}