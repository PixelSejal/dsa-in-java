package Arrays.greedy;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;                 // best day to buy so far
            } else {
                int profit = price - minPrice;   // profit if sold today
                if (profit > maxProfit) {
                    maxProfit = profit;          // best profit so far
                }
            }
        }
        return maxProfit;
    }
}
