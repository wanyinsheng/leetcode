package leet_202206;

/**121. 买卖股票的最佳时机
 * @Author wanys
 * @Date 2022/6/30 2:29 PM
 * @Version 1.0
 **/
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i <prices.length ; i++) {
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
