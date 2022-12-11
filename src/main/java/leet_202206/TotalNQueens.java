package leet_202206;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 52. N皇后 II
 * @Author wanys
 * @Date 2022/6/2 9:56 AM
 * @Version 1.0
 **/
public class TotalNQueens {

    public int totalNQueens(int n) {
        Set<Integer> columns = new HashSet<Integer>();
        Set<Integer> diagonals1 = new HashSet<Integer>();
        Set<Integer> diagonals2 = new HashSet<Integer>();
        return backtrack(n, 0, columns, diagonals1, diagonals2);

    }
    public int  backtrack( int n, int row, Set<Integer> columns, Set<Integer> diagonals1, Set<Integer> diagonals2) {
        if (row == n) {
            return 1;
        }else{
            int count=0;
            for (int i = 0; i <n ; i++) {
                if(columns.contains(i)){
                    continue;
                }
                int diagonal1 = row - i;
                if (diagonals1.contains(diagonal1)) {
                    continue;
                }
                int diagonal2 = row + i;
                if (diagonals2.contains(diagonal2)) {
                    continue;
                }
                //找到合适的位置了
                columns.add(i);
                diagonals1.add(diagonal1);
                diagonals2.add(diagonal2);
                //回溯row+1行
                count+=backtrack(n, row + 1, columns, diagonals1, diagonals2);
                //清空
                columns.remove(i);
                diagonals1.remove(diagonal1);
                diagonals2.remove(diagonal2);
            }
            return count;
        }
    }
}
