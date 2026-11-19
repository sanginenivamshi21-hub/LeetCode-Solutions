class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++){
            if(isEven(i))
                count++;
        }
        return count;
    }
    boolean isEven(int n){
        int res=0;
        while(n>0){
            res +=n%10;
            n /=10;
        }
        return (res%2==0)?true:false;
    }
}