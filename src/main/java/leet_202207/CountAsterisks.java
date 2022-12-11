package leet_202207;

/**
 * 2315. 统计星号
 * @Author wanys
 * @Date 2022/7/2 10:13 上午
 * @Version 1.0
 **/
public class CountAsterisks {

    public int countAsterisks(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int cnt=0;
        char[] chars = s.toCharArray();
        int n=chars.length;
        boolean inRange=false;
        for (int i = 0; i <n ; i++) {
            if(chars[i]=='|'){
                inRange=!inRange;
            }else if(chars[i]=='*'){
                if(!inRange){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
