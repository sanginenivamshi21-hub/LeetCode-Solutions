class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        while(target>1){
            if(maxDoubles==0){
                count +=target-2;
                target=1;
            }
            if((target & 1)!=1){
                if(maxDoubles>0){
                    target /=2;
                    maxDoubles--;
                    count++;
                }
            }else{
                target--;
                count++;
            }
        }
        return count;
    }
}