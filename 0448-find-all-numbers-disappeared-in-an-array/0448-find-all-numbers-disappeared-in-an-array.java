class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] marked=new boolean[nums.length+1];
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            marked[num]=true;
        }
        for(int i=1;i<marked.length;i++){
            if(!marked[i])
                list.add(i);
        }
        return list;
    }
}