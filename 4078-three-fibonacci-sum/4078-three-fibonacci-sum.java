class Solution {
    public boolean threeFibonacciSum(int n) {
        int f1=0,f2=1,f3=0;
        if(n==1) return false;
        while(n>(f1+f2+f3)){
            f3=f1+f2;
            if((f1+f2+f3)==n)
                return true;
            f1=f2;
            f2=f3;
        }
        return false;
    }
}