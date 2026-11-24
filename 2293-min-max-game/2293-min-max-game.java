class Solution {
    public int minMaxGame(int[] nums) {
        int n=nums.length;
        int[] newNums=new int[n/2];
        while(n!=1){
            boolean isEven=true;
            for(int i=0;i<n/2;i++){
                if(isEven){
                    newNums[i]=min(nums[2*i],nums[2*i+1]);
                }else{
                    newNums[i]=max(nums[2*i],nums[2*i+1]);
                }
                isEven = !isEven;
            }
            for(int i=0;i<n/2;i++){
                nums[i]=newNums[i];
            }
            n=n/2;
        }
        return nums[0];
    }
    int min(int a,int b){
        return a<b?a:b;
    }
    int max(int a,int b){
        return a>b?a:b;
    }
}