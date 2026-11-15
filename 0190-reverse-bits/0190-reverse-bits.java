class Solution {
    public int reverseBits(int n) {
        StringBuilder binrev=new StringBuilder();
        String bin=Integer.toBinaryString(n);
        int k=bin.length()-1;
        for(int i=0;i<32;i++){
            if (k>=0)
               binrev.append(bin.charAt(k));
            else
               binrev.append('0');
            k--;
        }
        return Integer.parseInt(binrev.toString(),2);
    }
}