package leet_202212;

public class MinimumTotalCost {
	public long minimumTotalCost(int[] nums1, int[] nums2) {
		long ans = 0L;
		int swapCnt = 0;//相同的个数
		int mode = 0;//相同的数里边的众数
		int modeCnt = 0;//相同的数里边众数的个数
		int n = nums1.length;
		int[] cnt = new int[n + 1];
		for (int i = 0; i < n; ++i) {
			int x = nums1[i];
			if (x == nums2[i]) {
				ans += i;
				++swapCnt;
				++cnt[x];//每个相同的数出现的个数（x就是相同的数）
				//更新众数
				if (cnt[x] > modeCnt) {
					modeCnt = cnt[x];
					mode = x;
				}
			}
		}
		//
		for (int i = 0; i < n && modeCnt * 2 > swapCnt; ++i) {
			int x = nums1[i], y = nums2[i];
			if (x != y && x != mode && y != mode) {
				ans += i;
				++swapCnt;
			}
		}
		return modeCnt * 2 > swapCnt ? -1 : ans;
	}


}
