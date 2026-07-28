class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> values=Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );
        int i=s.length()-1;
        int res=values.get(s.charAt(i));
        i--;
        while(i>=0){
            if(values.get(s.charAt(i))>=values.get(s.charAt(i+1)))
                res +=values.get(s.charAt(i));
            else
                res -=values.get(s.charAt(i));
            i--;
        }
        return res;
    }
}