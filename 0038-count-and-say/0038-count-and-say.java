class Solution {
    public String countAndSay(int n) {
        String res="1";
        for(int i=2;i<=n;i++){
            res=helper(res);
        }
        return res;
    }
    String helper(String str){
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i<str.length()){
            int j=i+1;
            int count=1;
            while(j<str.length() && str.charAt(j)==str.charAt(i)){
                count++;
                j++;
            }
            res.append(count).append(str.charAt(i));
            i=j;
        }
        return res.toString();
    }
}