package leet_202206;

/**
 * 剑指 Offer 29. 顺时针打印矩阵
 * @Author wanys
 * @Date 2022/6/10 10:26 PM
 * @Version 1.0
 **/
public class SpiralOrder {

    public int[] spiralOrder(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0){
            return new int[0];
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        //是否访问过数组
        boolean[][] visited=new boolean[rows][cols];
        int total= rows*cols;
        int[] res=new int[total];
        int row=0;
        int col=0;
        int[][] dirs=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int dirIndex=0;
        for (int i = 0; i <total; i++) {
            res[i]=matrix[row][col];
            visited[row][col]=true;
            int nextRow=row+dirs[dirIndex][0];
            int nextCol=col+dirs[dirIndex][1];
            if(nextRow<0||nextRow>=rows||nextCol<0||nextCol>=cols||visited[nextRow][nextCol]){
                dirIndex=(dirIndex+1)%4;
            }
            row+=dirs[dirIndex][0];
            col+=dirs[dirIndex][1];


        }
        return res;

    }
}
