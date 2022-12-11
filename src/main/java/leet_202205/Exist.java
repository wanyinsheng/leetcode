package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/2 7:37 PM
 * @Version 1.0
 **/
public class Exist {

    private static final int[][] DIRECTIONS = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    private int rows;
    private int cols;
    private int len;
    private boolean[][] visited;
    private char[] chars;

    private char[][] board;

    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        if (rows == 0)
            return false;
        visited = new boolean[rows][cols];
        //单词长度
        this.len = word.length();
        chars = word.toCharArray();
        this.board=board;

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <cols ; j++) {
                if(dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;

    }

    private boolean dfs(int x, int y, int begin) {
        //最后一个字符单独考虑
        if (begin == len - 1) {
            return board[x][y] == chars[begin];
        }
        if(board[x][y]==chars[begin]){
            visited[x][y]=true;//标记为已经访问
            //遍历四个方向
            for (int[] dir:DIRECTIONS) {
                int nextX=x + dir[0];
                int nextY=y + dir[1];
                //判断新位置的合法性
                if(inArea(nextX, nextY) && !visited[nextX][nextY]){
                    if (dfs(nextX, nextY, begin + 1)) {
                        return true;
                    }
                }
            }
            //四个方向都遍历完之后要回溯，修改状态
            visited[x][y]=false;
        }
        return false;
    }

    /**
     * 边界判断
     *
     * @param x
     * @param y
     * @return
     */
    private boolean inArea(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }


}
