class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target>letters[mid])
                start=mid+1;
            else if(target<letters[mid])
                end=mid-1;
            else
                start++;
        }
        if(start==letters.length)
            return letters[0];
        else
            return letters[start];
    }
}