class Solution {
    public int minOperations(int n) {
        int[] arr=new int[n];
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
            arr[i]=(2*i) + 1;
        for(int a:arr){
            sum+=a;
        }
        int start=0,end=arr.length-1;
        int target=sum/n;
        while(start<end){
            while(arr[start]!=target){
                arr[start]++;
                arr[end]--;
                count++;
            }
            start++;
            end--;
        }
        return count;
    }
}