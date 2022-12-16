package leet_202212;

/**
 * 1629. 按键持续时间最长的键
 */
public class SlowestKey {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
		int n=releaseTimes.length;
		//初始化为第一个按键
		char ans=keysPressed.charAt(0);
		int maxTime=releaseTimes[0];

		for (int i = 1; i <n ; i++) {
			char key=keysPressed.charAt(i);//当前按键
			int time=releaseTimes[i]-releaseTimes[i-1];
			//更新最大按键时间
			if(time>maxTime||time==maxTime&&key>ans){//时间相等的情况下，选择字母较大的
				ans=key;
				maxTime=time;
			}
		}
		return ans;

	}
}
