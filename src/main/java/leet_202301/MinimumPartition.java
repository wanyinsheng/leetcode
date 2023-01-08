package leet_202301;

/**
 * 2522. 将字符串分割成值不超过 K 的子字符串
 *
 * @Author wanys
 * @Date 2023/1/8 11:21
 * @Version 1.0
 **/
public class MinimumPartition {
    /**
     * 贪心算法
     * @param s
     * @param k
     * @return
     */
    public int minimumPartition(String s, int k) {
        int n = s.length();
        int ans = 1;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            //某一位如果就比k大，那就不合适
            if (s.charAt(i) - '0' > k) {
                return -1;
            }
            sum = sum * 10 + s.charAt(i) - '0';
            if (sum > k) {
                ans++;
                //需要把最后一位拿出来继续往下走
                sum %= 10;
            }
        }

        return ans;
    }
}
