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
            int k=i+1;
            int count=1;
            while(k<str.length() && str.charAt(k)==str.charAt(i)){
                count++;
                k++;
            }
            res.append(count).append(str.charAt(i));
            i=k;
        }
        return res.toString();
    }
}