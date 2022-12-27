package leet_202212;

/**
 * 45. 跳跃游戏 II
 */
public class Jump {
	public int jump(int[] nums) {
		/**
		 * 考虑每一步的覆盖范围，如果当前的覆盖范围不能到终点就要向前走一步
		 *
		 */
		if (nums == null || nums.length == 0 || nums.length == 1) {
			return 0;
		}
		//记录跳跃次数
		int count=0;
		//当前覆盖最大范围(每一步所能覆盖的范围)
		int coverRange=0;
		//最大的覆盖区域
		int maxCoverRange = 0;
		for (int i = 0; i < nums.length; i++) {
			//在可覆盖区域内更新最大的覆盖区域
			maxCoverRange = Math.max(maxCoverRange,i+nums[i]);

			//说明当前一步，再跳一步就到达了末尾
			if (maxCoverRange>=nums.length-1){
				count++;
				break;
			}

			//走到当前覆盖的最大区域时，更新下一步可达的最大区域
			if (i==coverRange){//这里是区域的边界
				coverRange = maxCoverRange;
				count++;
			}
		}
		return count;
	}
}
