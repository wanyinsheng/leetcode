package leet_202207;

/**
 * @Author wanys
 * @Date 2022/7/1 1:48 PM
 * @Version 1.0
 **/
public class Add {

    public int add(int a, int b) {
        while(b != 0) { // 当进位为 0 时跳出
            //n=a^b   异或运算  非进位和
            //c = (a & b) << 1   进位
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;

    }

}
