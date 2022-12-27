package leet_202212;

/**
 * 122. 买卖股票的最佳时机 II
 */
public class MaxProfit {
	public int maxProfit(int[] prices) {
		int res=0;
		for (int i = 0; i <prices.length ; i++) {
			res+=Math.max(prices[i]-prices[i-1],0);//拆解成每天的利润，只考虑正利润
		}
		return  res;
	}
}
