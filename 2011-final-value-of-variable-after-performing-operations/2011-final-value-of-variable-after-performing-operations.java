class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(String str:operations){
            if(str.charAt(1)=='+')
                res +=1;
            else
                res -=1;
        }
        return res; 
    }
}