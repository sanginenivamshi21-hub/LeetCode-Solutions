class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        for(int j=0,k=0;j<nums1.length && k<nums2.length;){
            if(nums1[j]==nums2[k]){
                    list.add(nums1[j]);
                j++;
                k++;
            }
            else if(nums1[j]<nums2[k])
                j++;
            else 
                k++;
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++)
            ans[i]=list.get(i);
        return ans;
    }
}