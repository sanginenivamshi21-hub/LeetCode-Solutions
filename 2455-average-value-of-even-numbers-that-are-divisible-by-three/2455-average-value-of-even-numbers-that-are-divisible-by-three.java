class Solution {
    public int averageValue(int[] nums) {
        int res=0,count=0;
        for (int i:nums){
            if(i%6==0){
                res +=i;
                count++;
            }
        }
        if(count==0) return 0;
        else return res/count;
    }
}