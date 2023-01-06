package leet_202301;

/**
 * 2520. 统计能整除数字的位数
 * @Author wanys
 * @Date 2023/1/6 22:43
 * @Version 1.0
 **/
public class CountDigits {
    public int countDigits(int num) {
        int ans=0;
        int t=num;
        while(t>0){
            if(num%(t%10)==0)
                ans++;
            t/=10;
        }
        return ans;
    }
}
