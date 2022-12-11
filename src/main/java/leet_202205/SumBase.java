package leet_202205;

/**
 * 1837. K 进制表示下的各位数字总和
 * @Author wanys
 * @Date 2022/5/20 5:04 PM
 * @Version 1.0
 **/
public class SumBase {

    public int sumBase(int n, int k) {
        int sum=0;
        while(n>0){
            sum+=n%k;
            n/=k;
        }
        return sum;
    }
}
