class Solution {
    public int addDigits(int num) {
        while((int)(Math.log10(num)+1)>1){
            num=digitSum(num);
        }
        return num;
    }
    int digitSum(int num){
        int ans=0;
        while(num>0){
            int digit=num%10;
            ans +=digit;
            num /=10;
        }
        return ans;
    }
}