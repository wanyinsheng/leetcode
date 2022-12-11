package leet_202206;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1222. 可以攻击国王的皇后
 * @Author wanys
 * @Date 2022/6/2 10:05 AM
 * @Version 1.0
 **/
public class QueensAttacktheKing {

    //往八个方向扩散，找到即停止
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        final int SIDE = 8;
        boolean[][] chessboard = new boolean[SIDE][SIDE];
        //标标记皇后的位置
        for (int[] queen : queens) {
            chessboard[queen[0]][queen[1]] = true;
        }
        int[][] directions = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        List<List<Integer>> queensAttackList = new ArrayList<List<Integer>>();
        for (int[] direction : directions) {
            //下一个位置
            int row = king[0] + direction[0], column = king[1] + direction[1];
            while (row >= 0 && row < SIDE && column >= 0 && column < SIDE) {
                if (chessboard[row][column]) {
                    //遇到皇后了，就添加到结果，并break
                    List<Integer> curQueen = new ArrayList<Integer>(Arrays.asList(row, column));
                    queensAttackList.add(curQueen);
                    break;
                } else {
                    //如果没遇到皇后，朝着这个方向继续前进
                    row += direction[0];
                    column += direction[1];
                }
            }
        }
        return queensAttackList;



    }
}
