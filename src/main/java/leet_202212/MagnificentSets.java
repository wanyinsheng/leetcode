package leet_202212;

import java.util.*;

/**
 * 2493. 将节点分成尽可能多的组
 * 二分图判定+BFS
 * 怎么判断是否为二分图，用染色法
 */
public class MagnificentSets {
	private List<Integer>[] g;
	private final List<Integer> nodes = new ArrayList<>();
	private int[] time, color; // time 充当 vis 数组的作用（避免在 BFS 内部重复创建 vis 数组）
	private int clock;

	public int magnificentSets(int n, int[][] edges) {
		g = new ArrayList[n];
		Arrays.setAll(g, e -> new ArrayList<>());
		for (int[] e : edges) {
			int x = e[0] - 1, y = e[1] - 1;
			g[x].add(y);
			g[y].add(x);
		}

		time = new int[n];
		color = new int[n];
		int  ans = 0;
		for (int i = 0; i < n; i++) {
			if (color[i] != 0) continue;
			nodes.clear();
			if (!isBipartite(i, 1)) return -1; // 如果不是二分图（有奇环），则无法分组
			// 否则一定可以分组
			int maxDepth = 0;
			for (int  x : nodes) // 枚举连通块的每个点，作为起点 BFS，求最大深度
				maxDepth = Math.max(maxDepth, bfs(x));
			ans += maxDepth;
		}
		return ans;

	}
	// 二分图判定，原理见视频讲解
	private boolean isBipartite(int x, int c) {
		nodes.add(x);
		color[x] = c;
		for (int y : g[x])
			if (color[y] == c || color[y] == 0 && !isBipartite(y, -c))
				return false;
		return true;
	}


	// 返回从 start 出发的最大深度
	private int bfs(int start) {
		int depth = 0;
		time[start] = ++clock;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		while (!queue.isEmpty()) {
			Queue<Integer> tmp = queue;
			queue = new LinkedList<Integer>();
			for (int x : tmp)
				for (int y : g[x])
					if (time[y] != clock) { // 没有在同一次 BFS 中访问过
						time[y] = clock;
						queue.add(y);
					}
			++depth;
		}
		return depth;
	}


}
