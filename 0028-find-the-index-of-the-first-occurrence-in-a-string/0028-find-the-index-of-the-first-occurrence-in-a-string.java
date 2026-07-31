class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){
            int temp=i;
            for(int j=0;j<needle.length() && temp<haystack.length();j++){
                if(haystack.charAt(temp)==needle.charAt(j)){
                    temp++;
                    if (j==needle.length()-1) return i;
                }
                else
                    break;
            }
        }
        return -1;
    }
}