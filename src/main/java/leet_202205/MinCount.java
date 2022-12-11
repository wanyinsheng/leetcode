package leet_202205;

/**
 * LCP 06. 拿硬币
 * @Author wanys
 * @Date 2022/5/21 1:54 PM
 * @Version 1.0
 **/
public class MinCount {

    public int minCount(int[] coins) {
        int count=0;
        for(int num:coins)
            count +=  (num+1) >> 1;
        return count;
    }
}
