class Solution {
    public boolean canAliceWin(int n) {
        int count=0;
        if(n<10) return false;
        int x=10;
        while(n>0){
            if(n-x>=0){
                n -=x;
                count++;
            }else{
                break;
            }
            x--;
        }
        return count%2==0?false:true;
    }
}