package leet_202205;

/**
 * 1221. 分割平衡字符串
 *
 * @Author wanys
 * @Date 2022/5/21 1:38 PM
 * @Version 1.0
 **/
public class BalancedStringSplit {

    public int balancedStringSplit(String s) {
        int count=0;
        int ans=0;//分割的段数
        //栈的原理
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='L'){
                count++;
            }else{//R
                count--;
            }
            //如果相互抵消了，那就累加一次
            if(count==0)
                ans++;
        }
        return ans;
    }

}
