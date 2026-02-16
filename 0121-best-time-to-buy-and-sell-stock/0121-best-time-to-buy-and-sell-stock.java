class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        int minprice = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            else{
                maxprofit = Math.max(maxprofit,prices[i]-minprice);
            }
        }
        return maxprofit;
    }
}