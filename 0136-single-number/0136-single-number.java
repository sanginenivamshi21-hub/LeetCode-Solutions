class Solution {
    public int singleNumber(int[] nums) {

        int an = 0;

        for (int num : nums) {
            an ^= num;
        }

        return an;
    }
}