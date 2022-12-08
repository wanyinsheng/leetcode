package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/29 2:23 PM
 * @Version 1.0
 **/
public class ConvertToBase7 {
    public String convertToBase7(int num) {
        if (num == 0)
            return "0";
        int negative=0;//1是负数
        if (num < 0) {
            num = Math.abs(num);
            negative=1;
        }

        StringBuffer stringBuffer = new StringBuffer();
        while (num > 0) {
            stringBuffer.append(num % 7);
            num /= 7;

        }
        if(negative==1)
            stringBuffer.append("-");
        //求完进制数，之后需要反转
        return stringBuffer.reverse().toString();

    }
}
