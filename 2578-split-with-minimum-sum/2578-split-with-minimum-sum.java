class Solution {
    public int splitNum(int num) {
        int len=(int)(Math.log10(num)+1);
        int num1=0,num2=0;
        int j=0,k=0;
        int[] nums=new int[len];
        for(int i=0;i<len;i++){
            nums[i]=num%10;
            num /=10;
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            if(i%2==0){
               num1 +=nums[i]*Math.pow(10,j);
               j++;
            }
            else{
               num2 +=nums[i]*Math.pow(10,k);
               k++;
            }
        }
        return num1+num2;
    }
}