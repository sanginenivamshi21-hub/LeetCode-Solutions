class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0,digitSum=0;
        for(int n:nums){
            elementSum +=n;
            digitSum +=digitSum(n);
        }
        return Math.abs(elementSum-digitSum);
    }
    int digitSum(int num){
        int sum=0;
        while(num>0){
            sum +=num%10;
            num /=10;
        }
        return sum;
    }
}