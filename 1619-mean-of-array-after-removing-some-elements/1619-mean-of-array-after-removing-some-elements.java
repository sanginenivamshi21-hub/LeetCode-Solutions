class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int trimLen=arr.length/20;
        int len=arr.length-(2*trimLen);
        double sum=0;
        for(int i=trimLen;i<arr.length-trimLen;i++){
            sum +=arr[i];
        }
        return sum/len;
    }
}