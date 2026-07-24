class Solution {
    public String reverseVowels(String s) {
      char[] str=s.toCharArray();
      int i=0,j=str.length-1;
      while(i<j){
        while(i<j && !isVowel(str[i]))
            i++;
        while(i<j && !isVowel(str[j]))
            j--;
        char temp=str[i];
        str[i]=str[j];
        str[j]=temp;
        i++;
        j--;
      }
      return new String(str);
    }
    boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}