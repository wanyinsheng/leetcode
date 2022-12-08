package leet_202210;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/10/18 10:26
 * @Version 1.0
 **/
public class SumOfNumberAndReverse {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            int rev=0;
            int temp=i;
            while(temp!=0){
                int r=temp%10;
                rev=rev*10+r;
                temp=temp/10;
            }
            if((i+rev)==num){
                return true;
            }
        }
        return false;
    }
}
