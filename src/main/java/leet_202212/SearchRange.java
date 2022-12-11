package leet_202212;

public class SearchRange {
	public int[] searchRange(int[] nums, int target) {
		int leftIndex = binarySearch(nums, target, true);//找第一个大于等于(第一个等于 \textit{target}target 的位置)
		int rightIndex = binarySearch(nums, target, false) - 1;//第一个大于 \textit{target}target 的位置减一
		if(leftIndex<=rightIndex&&rightIndex<nums.length&&nums[leftIndex] == target && nums[rightIndex] == target)
			return new int[]{leftIndex, rightIndex};
		return new int[]{-1,-1};
	}

	public int binarySearch(int[] nums, int target, boolean lower) {
		int left = 0;
		int right = nums.length-1;
		int ans = nums.length;
		while (left <= right) {
			//int mid = (left + right) / 2;//越界写法
			int mid=left + (right - left) / 2;
			if (nums[mid] > target || (lower && nums[mid] >= target)) {
				right = mid - 1;
				ans = mid;//更新中间值
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}
}
