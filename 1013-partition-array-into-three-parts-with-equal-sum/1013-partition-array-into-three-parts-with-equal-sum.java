class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        long max=0,partSum=0;
        int count=0;
        for(int n:arr){
            max+=n;
        }
        if(max%3!=0) return false;
        long sum=max/3;
        for(int n:arr){
            partSum+=n;
            if(partSum==sum){
                count++;
                partSum=0;
            }
        }
        if(count>=3) return true;
        return false;
    }
}