class Solution {
    public int countValidPrefixes(String s) {
        int valid=0,zeroes=0,ones=0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='0')
                zeroes++;
            else
                ones++;
            int check=Math.abs(zeroes-ones);
            if(check==1 || check==0 )
                valid++;
        }
        return valid;
    }
}