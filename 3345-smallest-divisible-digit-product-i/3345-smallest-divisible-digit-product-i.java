class Solution {
    public int smallestNumber(int n, int t) {
       while(n>0){
        if(digitProduct(n)%t==0)
            return n;
        n++;
       }
       return -1;
    }
    int digitProduct(int n){
        int res=1,digit;
        while(n>0){
            digit=n%10;
            res *=digit;
            n=n/10;
        }
        return res;
    }
}