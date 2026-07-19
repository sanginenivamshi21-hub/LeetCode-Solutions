class Solution {
    public int maximumProduct(int[] nums) {
        Integer first=null;
        Integer second=null;
        Integer third=null;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int num:nums){
            if(first==null || num>first){
                third=second;
                second=first;
                first=num;
            }
            else if(second==null || second<num){
                third=second;
                second=num;
            }
            else if(third==null || num>third){
                third=num;
            }
            if(num<=min1){
                min2=min1;
                min1=num;
            }
            else if(num<=min2){
                min2=num;
            }
        }
        return Math.max(first*second*third,first*min1*min2);
    }
}