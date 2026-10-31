class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String bits=Integer.toBinaryString(n);
        for(int i=0;i<bits.length();i++){
            if(bits.charAt(i)=='1')
               count++;
        }
        return count;
    }
}