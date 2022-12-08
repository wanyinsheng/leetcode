package leet_202205;

/**
 * 2243. 计算字符串的数字和
 * @Author wanys
 * @Date 2022/5/20 10:38 PM
 * @Version 1.0
 **/
public class DigitSum {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            //每次操作之后的字符串
            String temp="";
            int n=s.length();
            for (int i = 0; i < n; i+=k) {
                int val=0;//每一小段的和
                for (int j = i; j <Math.min(i+k,n) ; j++) {
                    val+=s.charAt(j)-'0';
                }

                temp+=val;
                System.out.println(temp);
            }
            //一轮结束之后就更新为s
            s=temp;
        }
        return s;
    }
}
