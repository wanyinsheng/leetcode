package leet_202203;

/**
 * @Author wanys
 * @Date 2022/3/29 2:11 PM
 * @Version 1.0
 **/

public class AddDigits {
    public int addDigits(int num) {
        while(num>10){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            //每一次求完和，都需要判断是否还为两位以上的数
            num=sum;
        }
        return num;
    }
}
