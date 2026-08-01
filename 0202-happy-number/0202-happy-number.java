class Solution {
    public boolean isHappy(int n) {
        int digit;
        HashSet<Integer> seen=new HashSet<>();
        while(true){
            int res=0;
            while(n>0){
            digit=n%10;
            res+=(int)Math.pow(digit,2);
            n=n/10;
        }
        n=res;
        if (n==1) return true;
        if(seen.contains(n)) break;
        else seen.add(n);
        }
        return false;
    }
}
