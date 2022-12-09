package leet_202212;

import java.util.Arrays;

public class DividePlayers {
	public long dividePlayers(int[] skill) {
		//如果最小的不和最大的匹配，那么最大的和一个比最小数更大的数匹配，就会导致技能点之和不相等。
		//因此最小的一定和最大的匹配。
		long ans=0;
		Arrays.sort(skill);
		int len=skill.length;
		//让每一队都和第一队去比较
		int sumA=skill[0]+skill[len-1];
		//遍历
		for (int i = 0; i <len/2 ; i++) {
			int x=skill[i];
			int y=skill[len-1-i];
			if(sumA!=x+y)
				return -1;//不能成功组队
			ans+=(x*y);
		}
		return ans;
	}
}
