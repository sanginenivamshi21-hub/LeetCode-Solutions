class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     int j=i+1;
        //     while(j<=i+k && j<nums.length){
        //         if(nums[i]==nums[j])
        //            return true;
        //         j++;
        //     }
        // }
        // return false;
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in the set, we found a nearby duplicate
            if (!window.add(nums[i])) {
                return true;
            }
            
            // Maintain a window size of exactly k elements
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        return false;
    }
}