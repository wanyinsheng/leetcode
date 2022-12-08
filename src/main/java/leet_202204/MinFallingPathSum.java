package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/24 1:08 PM
 * @Version 1.0
 **/
public class MinFallingPathSum {
    /**
     * 动态规划，逆向思考，从下往上进行动态规划，
     *
     * 注意需要处理超出边界的情况，即在第一列和最后一列只能下降到两个位置。
     * @param matrix
     * @return
     */
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        for (int i = n-2; i >=0 ; i--) {//倒数第二行开始向上遍历
            for (int j = 0; j <n ; j++) {
                //先初始化，[i+1][j]为下一个位置
                int best=matrix[i+1][j];
                //左下位置
                if (j > 0)
                    best = Math.min(best, matrix[i+1][j-1]);
                //右下位置
                if (j+1 < n)
                    best = Math.min(best, matrix[i+1][j+1]);

                //计算上一行的dp
                matrix[i][j]+=best;
            }
        }
        int ans=matrix[0][0];
        //遍历第一行，找最小值
        for(int num:matrix[0])
            ans=Math.min(ans,num);
        return ans;
    }
}
