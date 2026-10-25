class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int nums[]:grid){
            for (int n:nums)
               if(n<0)
                  count++;
        }
        return count;
    }
}