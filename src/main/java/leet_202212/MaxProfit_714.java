package leet_202212;

/**
 * 714. 买卖股票的最佳时机含手续费
 */
public class MaxProfit_714 {
	public int maxProfit(int[] prices, int fee) {
		int n = prices.length;
		int buy = prices[0] + fee;//初始化首次买入价格
		int profit = 0;
		for (int i = 1; i < n; ++i) {
			if (prices[i] + fee < buy) {//更新买入时间，出现了更合适的
				buy = prices[i] + fee;//买入价格
			} else if (prices[i] > buy) {//当前价格大于买入价格，考虑卖出
				profit += prices[i] - buy;
				buy = prices[i];//这里为什么不在加2了呢？是可能后序不会买了？
			}
		}
		return profit;
	}
}
