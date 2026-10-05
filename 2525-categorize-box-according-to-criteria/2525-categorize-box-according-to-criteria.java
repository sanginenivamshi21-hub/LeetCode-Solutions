class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulk=false,heavy=false;
        if(length>=10000 || width>=10000 || height>=10000 || ((long)length*(long)width*(long)height)>=Math.pow(10,9))
            bulk=true;
        if(mass>=100)
            heavy=true;
        if(bulk && heavy)
            return "Both";
        if(!bulk && !heavy)
            return "Neither";
        if(bulk && !heavy)
            return "Bulky";
        else 
            return "Heavy";
    }
}