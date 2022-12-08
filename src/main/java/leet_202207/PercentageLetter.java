package leet_202207;

/**
 * 2278. 字母在字符串中的百分比
 * @Author wanys
 * @Date 2022/7/2 10:10 上午
 * @Version 1.0
 **/
public class PercentageLetter {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int cnt=0;
        for (int i = 0; i <n ; i++) {
            if(letter==s.charAt(i))
                cnt++;
        }
        return 100*cnt/n;//向下取整
    }
}
