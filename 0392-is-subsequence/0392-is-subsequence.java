class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()==0) return true;
        int pos=0;
        for(int i=0;i<s.length();i++){
            pos=t.indexOf(s.charAt(i),pos);
            if (pos==-1) return false;
            else pos++;
        }
        return true;
    }
}