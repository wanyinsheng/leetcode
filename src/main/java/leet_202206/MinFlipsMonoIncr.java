package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/30 3:49 PM
 * @Version 1.0
 **/
public class MinFlipsMonoIncr {

    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int dp0 = 0;
        int dp1 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int dp0New = dp0;
            int dp1New = Math.min(dp0, dp1);
            if(c=='1'){
                dp0New++;
            }else{
                dp1New++;
            }
            dp0 = dp0New;
            dp1 = dp1New;
        }
        return Math.min(dp0, dp1);
    }
}
