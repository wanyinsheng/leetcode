package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/28 10:55 PM
 * @Version 1.0
 **/
public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int pre=-1;
        while (n != 0) {
             int  curr = n % 2;
            n /= 2;
            //判断是否跟后一位相等
            if(pre==curr)
            {
                return false;
            }
            pre=curr;

        }
        return true;
    }
}
