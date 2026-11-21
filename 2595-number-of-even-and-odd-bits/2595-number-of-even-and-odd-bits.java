class Solution {
    public int[] evenOddBit(int n) {
        String bits=Integer.toBinaryString(n);
        boolean flag=true;
        int evenCount=0,oddCount=0;
        for(int i=bits.length()-1;i>=0;i--){
            if(flag){
                if(bits.charAt(i)=='1')
                    evenCount++;
            }
            else{
                if(bits.charAt(i)=='1')
                    oddCount++;
            }
            flag =!flag;
        }
        return new int[]{evenCount,oddCount};
    }
}