class Solution {
    public int mySqrt(int x) {
        long r=x;
        if(x<2)
          return x;
        while(true){
            if(r*r>x)
               r=(r+x/r)/2;
            else
                break;
        }
        return (int)r;
    }
}