package leet_202207;

/**
 * 2264. 字符串中最大的 3 位相同数字
 *
 * @Author wanys
 * @Date 2022/7/3 1:05 上午
 * @Version 1.0
 **/
public class LargestGoodInteger {

    public String largestGoodInteger(String num) {
        int n=num.length();
        int res=0;
        for (int i = 0; i <n-2 ; i++) {
            if(num.charAt(i)==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2)){
                res=Math.max(res, Integer.parseInt(num.substring(i,3)));
            }

        }
        return String.valueOf(res);

    }
}
