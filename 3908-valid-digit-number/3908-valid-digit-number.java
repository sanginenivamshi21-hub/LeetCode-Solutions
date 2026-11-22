class Solution {
    public boolean validDigit(int n, int x) {
       String digits=Integer.toString(n);
       char val=(char)(x+'0');
       if(digits.indexOf(val)!=-1 && digits.charAt(0)!=val)
            return true;
        return false;
    }
}