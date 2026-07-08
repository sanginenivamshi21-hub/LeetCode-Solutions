class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0,minprice=Integer.MAX_VALUE;
        for (int price:prices){
            if(price<minprice)
                minprice=price;
            int profit=price-minprice;
            if(profit>maxprofit)
                maxprofit=profit;
        }
        return maxprofit;
    }
}