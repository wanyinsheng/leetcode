package leet_202205;

/**
 * 190. 颠倒二进制位
 * @Author wanys
 * @Date 2022/5/20 4:05 PM
 * @Version 1.0
 **/
public class ReverseBits {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 31; i >=0 && n != 0; i--) {
            rev |= (n & 1) << (i);
            n >>>= 1;
        }
        return rev;


    }
}
