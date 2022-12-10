package leet_202212;

import java.util.Arrays;

/**
 * 611. 有效三角形的个数
 */
public class TriangleNumber {
	public int triangleNumber(int[] nums) {

		int n=nums.length;
		Arrays.sort(nums);
		int ans=0;
		//只需要a+b>c即可
		for (int i = 0; i < n; i++) {//a
			for (int j = i+1; j <n ; j++) {//b
				//确定c的边界
				int left=j+1,right=n-1,k=j;//k为当前确定了ab事，符合c的最大值索引
				//利用二分法找到c<a+b的个数（对于已经确定的a和b，此时的c有k个）
				while(left<=right){
					int mid=(left+right)/2;
					if (nums[mid] < nums[i] + nums[j]) {//只有小于的时候才更行k值
						k = mid;
						left = mid + 1;
					} else {
						right = mid - 1;
					}
				}
				ans += k - j;
			}
		}
		return ans;
	}
}
