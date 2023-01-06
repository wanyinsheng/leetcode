package leet_202301;

/**
 * 面试题 05.07. 配对交换
 * @Author wanys
 * @Date 2023/1/6 22:30
 * @Version 1.0
 **/
public class ExchangeBits {
    public int exchangeBits(int num) {
        //奇数
        int odd = num & 0x55555555;
        //偶数
        int even = num & 0xaaaaaaaa;
        odd = odd << 1;
        even = even >>> 1;
        return odd | even;


    }
}
