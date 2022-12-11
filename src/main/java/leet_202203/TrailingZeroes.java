package leet_202203;

/**
 * 172. 阶乘后的零
 *
 * @Author wanys
 * @Date 2022/3/28 11:56 PM
 * @Version 1.0
 **/
public class TrailingZeroes {

    /**
     * 其实就是求质因子是5的个数
     *
     * @param n
     * @return
     */
    public int trailingZeroes(int n) {
        int result = 0;
        for (int i = 5; i <=n ; i+=5) {
            for (int j=i; j %5==0 ; j/=5) {
                result++;
            }
        }
        return result;
    }
}
