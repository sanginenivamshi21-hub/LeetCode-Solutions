class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length()-1;
        int i=len;
        int j=0;
        while(s.charAt(i)==' ')
           i--;
        while(i>=0 && s.charAt(i)!=' '){
            j++;
            i--;
        }
        return j;
    }
}