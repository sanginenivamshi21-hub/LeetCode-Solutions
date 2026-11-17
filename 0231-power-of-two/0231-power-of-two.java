class Solution {
    public boolean isPowerOfTwo(int n) {
        int i=0;
        double num=Math.pow(2,i);
        while(num<=n){
            i++;
            if(num==n)
               return true;
            num=Math.pow(2,i);
        }
        return false;
    }
}