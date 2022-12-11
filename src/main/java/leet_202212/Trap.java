package leet_202212;

/**
 * 42. 接雨水
 */
public class Trap {
	/**
	 * 前缀和后缀数组
	 * @param height
	 * @return
	 */
	public int trap(int[] height) {
		int n=height.length;
		//前缀后缀数组
		int[] pre =new int[n];
		int[] post=new int[n];
		pre[0]=height[0];
		for (int i = 1; i < n; i++) {
			pre[i]=Math.max(pre[i-1],height[i]);
		}
		post[n-1]=height[n-1];
		for (int i = n-2; i >=0 ; i--) {
			post[i]=Math.max(post[i+1],height[i]);
		}
		int ans=0;
		//计算每一小块能容纳的数量
		for (int i = 0; i < n; i++) {
			ans+=Math.min(pre[i],post[i])-height[i];
		}
		return ans;

	}

}
