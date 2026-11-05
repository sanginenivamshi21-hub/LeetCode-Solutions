class Solution {
    public int alternateDigitSum(int n) {
        int count=(int)Math.log10(n)+1,sum=0;
        while(n>0){
            int digit=n%10;
            if(count%2==0) sum -=digit;
            else sum +=digit;
            n /=10;
            count--;
        }
        return sum;
    }
}