package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/3 5:12 PM
 * @Version 1.0
 **/
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;//第一个数的最后一位
        int j = num2.length() - 1;//第二个数的最后一位
        int add = 0;//进位
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            //将字符变成数字
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            //相加
            int res = x + y + add;
            ans.append(res % 10);//余数作为和
            add/=10;//进位
            i--;
            j--;
        }
        //翻转
        return ans.reverse().toString();
    }
}
