package leet_202304;

/**
 * @Author wanys
 * @Date 2023/4/24 15:47
 * @Version 1.0
 **/
public class Solve {
    int rows;
    int cols;

    /**
     * 深度优先
     * 和边界O不相连的都是被包围的O
     */
    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        if (rows == 0 || cols == 0) {
            return;
        }
        //先标记从边界上所有连着的的O
        for (int i = 0; i < rows; i++) {
            dfs(board, i, 0);
            dfs(board, i, cols - 1);
        }
        for (int i = 1; i < cols - 1; i++) {
            dfs(board, 0, i);
            dfs(board, rows - 1, i);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //已经被标记为A的就是和边界O相连的O，需要改回去
                if (board[i][j] == 'A') {
                    board[i][j] = 'O';
                } else if (board[i][j] == 'O') {//剩余的O都是被X包围的，改成X
                    board[i][j] = 'X';
                }
            }
        }
    }

    void dfs(char[][] board, int x, int y) {//处理所有的O（可能还是O，可能需要改为X）
        if (x < 0 || x >= rows || y < 0 || y >= cols || board[x][y] != 'O') {
            return;
        }
        //标记为已经访问   将O改为A
        board[x][y] = 'A';
        //向四个方向搜索
        dfs(board, x + 1, y);
        dfs(board, x - 1, y);
        dfs(board, x, y + 1);
        dfs(board, x, y - 1);
    }
}
