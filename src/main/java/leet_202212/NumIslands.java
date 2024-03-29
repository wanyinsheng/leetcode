package leet_202212;

public class NumIslands {
	private int rows;
	private int cols;
	private char[][] grid;
	private int[][] dirs=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

	public int numIslands(char[][] grid) {
		//初始化
		rows=grid.length;
		cols=grid[0].length;
		this.grid=grid;

		int ans=0;
		for (int i = 0; i <rows ; i++) {
			for (int j = 0; j <cols ; j++) {
				if(grid[i][j]=='1'){
					dfs(i,j);
					ans++;
				}
			}
		}
		return ans;

	}
	public void dfs(int i ,int j){
		//标记为已经访问，或者修改为水域
		grid[i][j]='0';
		for(int[] dir:dirs){
			int nextX=i+dir[0];
			int nextY=j+dir[1];
			if(nextX>=0&&nextX<rows&&nextY>=0&&nextY<cols&&grid[nextX][nextY]=='1'){
				dfs(nextX,nextY);
			}
		}

	}
}
