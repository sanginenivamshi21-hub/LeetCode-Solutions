class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        int mins=0,count=0;
        for(int num:nums){
            if(num<target)
               mins++;
            if(num==target)
               count++;
        }
        if (count==0)
           return list;
        for(int i=mins;i<mins+count;i++){
            list.add(i);
        }
        return list;
}
}