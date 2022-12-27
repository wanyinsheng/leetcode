package leet_202212;

/**
 * 134. 加油站
 */
public class CanCompleteCircuit {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int curSum = 0;//从0开始的累加和
		int totalSum = 0;
		int index = 0;
		for (int i = 0; i < gas.length; i++) {
			curSum += gas[i] - cost[i];
			totalSum += gas[i] - cost[i];
			if (curSum < 0) {//当前累加和小于0.index就更新成下一个
				index = (i + 1) % gas.length ;
				curSum = 0;//和更新为0
			}
		}
		if (totalSum < 0)
			return -1;
		return index;

	}
}
