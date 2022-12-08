package leet_202207;

/**
 * @Author wanys
 * @Date 2022/7/4 1:55 下午
 * @Version 1.0
 **/
public class TimeRequiredToBuy {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        int res=0;
        for (int i = 0; i <n ; i++) {
            // 遍历计算每个人所需时间
            if (i <= k){
                res += Math.min(tickets[i], tickets[k]);//和k比较
            }
            else{
                res += Math.min(tickets[i], tickets[k] - 1);//k+1之后的人少一次
            }
        }
        return res;
    }
}
