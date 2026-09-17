class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        int k=0;
        int j=str.length()-1;
        while(k<j){
            if(str.charAt(k)!=str.charAt(j))
               return false;
            k++;
            j--;
        }
        return true;
    }
}