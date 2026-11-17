class Solution {
    public boolean isPowerOfTwo(int n) {
        double num=1;
        while(num<=n){
            if(num==n)
               return true;
            num *=2;
        }
        return false;
    }
}