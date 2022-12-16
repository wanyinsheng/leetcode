package leet_202212;

/**
 * 2496. 数组中字符串的最大值
 */
public class MaximumValue {
	public int maximumValue(String[] strs) {
		int ans=0;
		for(String str:strs){
			try {
				ans=Math.max(ans,Integer.parseInt(str));
			}catch (Exception e){
				ans=Math.max(ans,str.length());
			}
		}
		return ans;

	}

}
