class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        if(x==0) return true;
        int len=(int)Math.log10(x)+1;
        if(x<0)
           return false;
        int x2=0,digit;
        while(temp>0){
            digit =temp%10;
            temp /=10;
            x2 +=digit * (int)Math.pow(10,len-1);
            len--;
        }
        if(x2==x){
            return true;
        }
        return false;
    }
}