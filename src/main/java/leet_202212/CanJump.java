package leet_202212;

/**
 * 55. 跳跃游戏
 */
public class CanJump {
	public boolean canJump(int[] nums) {
		if (nums.length == 1) {
			return true;
		}
		//每跳一下，都考虑一下能跳到的最远距离
		//覆盖范围，初始为0
		int coverRange=0;
		for (int i = 0; i <= coverRange; i++) {
			//不断的更新最远距离
			coverRange = Math.max(coverRange, i + nums[i]);
			//判断是否可以到达
			if (coverRange >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}
}
