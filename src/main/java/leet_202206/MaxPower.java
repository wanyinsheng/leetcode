package leet_202206;

/**
 * 1446. 连续字符
 * @Author wanys
 * @Date 2022/6/13 10:06 PM
 * @Version 1.0
 **/
public class MaxPower {
    public int maxPower(String s) {
        int count=1;//第一个字符
        int ans=0;
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
                ans = Math.max(ans, count);
            }else{
                count=1;//不匹配，更新到1
            }
        }
        return ans;

    }
}
