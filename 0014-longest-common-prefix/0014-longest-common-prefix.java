class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for (int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix))
                prefix=removeLast(prefix);
        }
        return prefix;
    }
    String removeLast(String prefix){
        String str="";
        if(prefix.length()>0 && prefix!=null){
            str =prefix.substring(0,prefix.length()-1);
        }
        return str;
    }
}