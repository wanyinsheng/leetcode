package leet_202301;

import java.util.ArrayList;
import java.util.List;

/**
 * 1260. 二维网格迁移
 * @Author wanys
 * @Date 2023/1/5 14:51
 * @Version 1.0
 **/
public class ShiftGrid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        //初始化出来一个结果集，填充0
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ret.add(row);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int index1 = (i * n + j + k) % (m * n);//k次移动之后新的索引
                ret.get(index1 / n).set(index1 % n, grid[i][j]);
            }
        }
        return ret;



    }
}
