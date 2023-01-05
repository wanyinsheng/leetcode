package leet_202301;

/**
 * 1475. 商品折扣后的最终价格
 * @Author wanys
 * @Date 2023/1/5 15:55
 * @Version 1.0
 **/
public class FinalPrices {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; ++i) {
            int discount = 0;
            for (int j = i + 1; j < n; ++j) {// j从i+1开始
                if(prices[j] <= prices[i]){
                    discount = prices[j];
                    //找到第一个满足的的，这里要跳出for循环
                    break;
                }
            }
            //针对每一件商品找到的折扣
            ans[i] = prices[i] - discount;
        }
        return ans;


    }
}
