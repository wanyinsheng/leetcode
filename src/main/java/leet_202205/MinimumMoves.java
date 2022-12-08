package leet_202205;

/**
 * 2027. 转换字符串的最少操作次数
 * @Author wanys
 * @Date 2022/5/20 10:57 PM
 * @Version 1.0
 **/
public class MinimumMoves {
    public int minimumMoves(String s) {
        if(s==null||s.length()==0)
            return 0;
//        if(s.length()<=3)
//            return "OOO".equals(s)?0:1;
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='X'){
                cnt++;
                i+=2;//因为最后还会有for的+1
            }
        }
        return cnt;
    }
}
