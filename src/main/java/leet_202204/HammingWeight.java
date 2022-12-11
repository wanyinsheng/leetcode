package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/23 12:29 AM
 * @Version 1.0
 **/
public class HammingWeight {

    /**
     * 方法一：循环检查二进制位
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int res=0;
        //当检查第 i 位时，我们可以让 nn 与 2^i进行与运算，当且仅当n 的第 i 位为 1 时，运算结果不为 0。
        for (int i = 0; i <32 ; i++) {
            if((n&(1<<i))!=0){
                res++;
            }

        }
        return res;

    }

    /**
     * 位运算优化
     * @param n
     * @return
     */
    public int hammingWeight1(int n) {
        int res=0;
        //n&(n - 1)，其运算结果恰为把 n 的二进制位中的最低位的 1 变为 0 之后的结果。
        while(n!=0){
            n&=n-1;
            res++;
        }
        return res;

    }

}
