package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/23 12:23 AM
 * @Version 1.0
 **/
public class Reverse {
    public int reverse(int x) {

        int rev=0;
        while(x!=0){
            if(rev<Integer.MIN_VALUE/10||rev>Integer.MAX_VALUE/10){
                //超出了整数范围
                return 0;
            }
            int digit=x%10;
            x/=10;
            rev=rev*10+digit;
        }
        return rev;
    }

}
