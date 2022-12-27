package leet_202212;

/**
 * 1909. 删除一个元素使数组严格递增
 */
public class CanBeIncreasing {
	public boolean canBeIncreasing(int[] nums) {
		int n = nums.length;
		int count = 0;
		int last = nums[0];
		for(int i=1;i<n;i++){
			if(nums[i]<=last){
				count++;//正常的每次for循环看成是删除了nums[i]
				if(i>1&&nums[i]<=nums[i-1]){
					last=nums[i-1];
					continue;//这里是删除了nums[i-1]
				}
			}
			last=nums[i];
		}
		return count<=1;
	}
}
