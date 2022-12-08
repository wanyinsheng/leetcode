package leet_202206;

import java.util.ArrayList;
import java.util.List;

/**
 * 1380. 矩阵中的幸运数
 * @Author wanys
 * @Date 2022/6/14 9:56 AM
 * @Version 1.0
 **/
public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        //行最小，列最大的元素

        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return  null;
        }

        int m = matrix.length, n = matrix[0].length;
        int rowMax = 0, k = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int curMin = matrix[i][0];
            int c = 0;
            for (int j = 1; j < n; j++) {
                if (curMin > matrix[i][j]) {
                    curMin = matrix[i][j];
                    c = j;
                }
            }
            if (rowMax < curMin) {
                rowMax = curMin;
                k = c;
            }
        }
        for (int i = 0; i < m; i++) {
            if (rowMax < matrix[i][k]) {
                return list;
            }
        }
        list.add(rowMax);
        return list;

    }
}
