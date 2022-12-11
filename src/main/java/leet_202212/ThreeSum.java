package leet_202212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 三数之和
 */
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		//对数组进行排序
		Arrays.sort(nums);
		//第1个数的取值范围
		for (int i = 0; i < nums.length - 2; i++) {
			//第二和第三个数使用双指针
			//第二个数从i+1开始
			int j = i + 1;
			//第三个数从右边找
			int k = nums.length - 1;
			while (j < k) {
				//找到满足条件的数
				if (nums[j] + nums[k] == -nums[i]) {
					ArrayList<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[j]);
					list.add(nums[k]);
					res.add(list);//添加到结果集
					j++;
					k--;
					//考虑到有重复的数，如果遇到了就跳过
					while (j < k && nums[j] == nums[j - 1]) {//因为这里比较的时候，j已经进行加一操作了
						j++;
					}
					while (j < k && nums[k] == nums[k + 1]) {
						k--;
					}


				} else if (nums[j] + nums[k] > -nums[i]) {//如果和大于0
					k--;
				} else {//如果和小于0
					j++;
				}
			}
			//判断i是否是可以跳过的
			while (i < nums.length - 2 && nums[i + 1] == nums[i]) {
				i++;
			}
		}
		return res;
	}
}
