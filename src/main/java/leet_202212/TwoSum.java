package leet_202212;

/**
 * 167. 两数之和 II - 输入有序数组
 */
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		/**
		 * 双指针
		 */
		int low=0;
		int high=numbers.length-1;
		while(low<high){//题目已经明确了low<high
			int sum=numbers[low]+numbers[high];
			if(sum==target) {
				return new int[]{low+1, high+1};//下标从1开始的
			}else if(sum<target){
				low++;
			}else{
				high--;
			}

		}
		return new int[]{-1,-1};
	}
}
