package leet_202301;

/**
 * @Author wanys
 * @Date 2023/1/8 10:13
 * @Version 1.0
 **/
public class CycleLengthQueries {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; ++i) {
            int res = 1, a = queries[i][0], b = queries[i][1];
            while (a != b) {
                if (a > b) {//找深度大的节点先走
                    a /= 2;//除以2找父节点
                } else {
                    b /= 2;
                }
                //两个节点无论谁往上走一步，都加一
                ++res;
            }
            ans[i] = res;
        }
        return ans;
    }

    /**
     * 方法二：位运算优化
     *
     * @param n
     * @param queries
     * @return
     */
    public int[] cycleLengthQueries1(int n, int[][] queries) {
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; ++i) {
            int a = queries[i][0], b = queries[i][1];
            if (a > b) {
                int tmp = a;
                a = b;
                b = tmp; // 交换，保证 a <= b
            }
            int d = Integer.numberOfLeadingZeros(a) - Integer.numberOfLeadingZeros(b);
            ans[i] = d + (32 - Integer.numberOfLeadingZeros(a ^ (b >> d))) * 2 + 1;
        }
        return ans;
    }


}
