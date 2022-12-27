package leet_202212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2497. 图中最大星和
 */
public class MaxStarSum {
	public int maxStarSum(int[] vals, int[][] edges, int k) {
		int ans=Integer.MIN_VALUE;;
		int n=vals.length;
		for (int[] nb:edges){
			Arrays.sort(nb);
			int sum=0;
			for (int i = n-1; i >=n-k; i--) {
				sum+=nb[i];
			}
			ans=Math.max(ans,sum);
		}
		return ans;
	}
}
