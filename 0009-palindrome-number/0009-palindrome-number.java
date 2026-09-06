class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int k=0;
        int j=s.length()-1;
        while(k<j){
            if(s.charAt(k)!=s.charAt(j))
               return false;
            k++;
            j--;
        }
        return true;
    }
}