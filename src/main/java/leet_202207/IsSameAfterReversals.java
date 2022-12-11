package leet_202207;

/**
 * 2119. 反转两次的数字
 * @Author wanys
 * @Date 2022/7/2 10:40 上午
 * @Version 1.0
 **/
public class IsSameAfterReversals {

    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 != 0;
    }

}
