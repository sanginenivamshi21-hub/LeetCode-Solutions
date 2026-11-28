class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        if (rowIndex==0) return list;
        list.add(1);
        if(rowIndex==1) return list;
        int i=2;
        while(i<=rowIndex){
            List<Integer> list1=new ArrayList<>();
            list1.add(1);
            for(int j=1;j<i;j++){
                list1.add(list.get(j-1)+list.get(j));
            }
            list1.add(1);
            list.clear();
            list.addAll(list1);
            i++;
        }
        return list;
    }
}