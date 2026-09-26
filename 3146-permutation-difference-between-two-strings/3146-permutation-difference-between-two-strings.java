class Solution {
    public int findPermutationDifference(String s, String t) {
        int res=0;
        for(int j=0;j<s.length();j++){
            res +=Math.abs(j-t.indexOf(s.charAt(j)));
        }
        return res;
    }
}