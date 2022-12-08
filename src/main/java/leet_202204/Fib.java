package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/23 12:06 AM
 * @Version 1.0
 **/
public class Fib {
    /**
     * 动态规划
     * @param n
     * @return
     */
    public int fib(int n) {
        if(n<2)
            return n;
        int x=0;
        int y=0;
        int res=1;
        for (int i = 2; i <=n ; i++) {
            x=y;
            y=res;
            res=x+y;

        }
        return res;
    }
}
