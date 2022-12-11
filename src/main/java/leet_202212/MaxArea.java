package leet_202212;

/**
 * 11. 盛最多水的容器
 */
public class MaxArea {
	public int maxArea(int[] height) {
		int left=0;
		int ans=0;
		int right=height.length-1;
		while(left<right){
			int area=Math.min(height[left],height[right])*(right-left);
			ans=Math.max(ans,area);
			if(height[left]<height[right]){//左边的短了，往右移动
				left++;
			}else{
				right--;
			}
		}
		return ans;
	}
}
