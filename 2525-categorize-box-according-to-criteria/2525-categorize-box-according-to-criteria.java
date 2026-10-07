class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky=false,heavy=false;
        if(length>=10000 || width>=10000 || height>=10000 || ((long)length*(long)width*(long)height)>=Math.pow(10,9))
            bulky=true;
        if(mass>=100)
            heavy=true;
        if(bulky && heavy)
            return "Both";
        if(!bulky && !heavy)
            return "Neither";
        if(bulky && !heavy)
            return "Bulky";
        else 
            return "Heavy";
    }
}