class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] res=new int[m+n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int a=num1.charAt(i)-'0';
                int b=num2.charAt(j)-'0';
                int product=a*b;
                int sum = res[i+j+1] + product;
                res[i+j+1] = sum % 10;
                res[i+j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<res.length && res[i]==0) i++;
        while(i<res.length){
           sb.append(res[i]);
           i++;
        }
        return sb.toString();
    }
}