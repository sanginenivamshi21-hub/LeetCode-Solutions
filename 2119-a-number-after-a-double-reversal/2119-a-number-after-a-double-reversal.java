class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=reverse(num);
        if(reverse(temp)!=num)
           return false;
        return true;
    }
    public int reverse(int x) {
        int count=0;
        if (x<0){
            x *=-1;
            count++;
        }
        long res=0;
        while(x>0){
            res =res*10+(x%10);
            x /=10;
           }
        if(count==1)
            res*=-1;
        if(res>2147483647 || res<-2147483648)
            return 0;
        return (int)res;
    }
}