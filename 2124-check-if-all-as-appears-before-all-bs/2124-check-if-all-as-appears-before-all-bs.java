class Solution {
    public boolean checkString(String s) {
        int start=s.indexOf('b');
        int end=s.length()-1;
        if(start!=-1){
            while(start<end){
            if(s.charAt(start+1)=='a') return false;
            start++;
        }
        }
        return true;
    }
}