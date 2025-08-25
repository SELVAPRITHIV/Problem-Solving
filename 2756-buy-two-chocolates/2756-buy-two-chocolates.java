class Solution {
    public int buyChoco(int[] prices, int money) {
        int n = prices.length;
        Arrays.sort(prices);
        int min = 0;
        for(int i=0;i<3-2;i++){
           if((prices[i]+prices[i+1])<=money){
            min = money - (prices[i]+prices[i+1]);
            return min;
           }
        }
        return money;
    }
}