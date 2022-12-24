package leet_202212;

import java.util.Arrays;

public class Candy {
	public int candy(int[] ratings) {
		//一次是从左到右遍历，只比较右边孩子评分比左边大的情况。
		//一次是从右到左遍历，只比较左边孩子评分比右边大的情况。
		int len = ratings.length;
		int[] candyVec = new int[len];
		candyVec[0] = 1;//第一个初始化为1
		//从左向右遍历
		for (int i = 1; i < len; i++) {
			candyVec[i] = (ratings[i] > ratings[i - 1]) ? candyVec[i - 1] + 1 : 1;//后边的评分高就+1，评分低就给1
		}
		//从右向左遍历(矫正双向都要符合)
		for (int i = len - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				candyVec[i] = Math.max(candyVec[i], candyVec[i + 1] + 1);//左边大，就更新，需要考虑和右边元素的大小
			}
		}

//		int ans = 0;
//		for (int num : candyVec) {
//			ans += num;
//		}
//		return ans;
		return Arrays.stream(candyVec).sum();

	}
}
