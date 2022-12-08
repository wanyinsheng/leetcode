package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/15 7:22 AM
 * @Version 1.0
 **/
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int m =matrix.length;
        int n=matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n ; j++) {
                if(matrix[i][j]==0){
                    row[i]=col[j]=true;
                }

            }

        }
        //行和列修改为0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }


    }

}
