class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0,k=0,i=0;
        int[] arr=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                arr[k++]=nums2[j++];
            }else{
                arr[k++]=nums1[i++];
            }
        }
            while(j<n){
                arr[k++]=nums2[j++];
            }
        
            while(i<m){
                arr[k++]=nums1[i++];
            }
        for (int x=0;x<m+n;x++)
            nums1[x]=arr[x];
    }
    
}