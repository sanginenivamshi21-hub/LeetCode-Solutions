class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer=new int[nums.length];
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int res=1;
        for(int i=0;i<nums.length;i++){
            prefix[i]=res;
            res *=nums[i];
        }
        res=1;
        for(int i=nums.length-1;i>=0;i--){
            suffix[i]=res;
            res *=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            answer[i]=prefix[i] * suffix[i];
        }
        return answer;
    }
}