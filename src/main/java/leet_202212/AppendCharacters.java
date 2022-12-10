package leet_202212;

public class AppendCharacters {
	public int appendCharacters(String s, String t) {
		/**
		 *
		 * 双指针在s中找能匹配到t的字符
		 */
		int n=t.length();
		int j=0;//t字符串的索引
		for (int i = 0; i <s.length() ; i++) {
			if(j<n&&s.charAt(i)== t.charAt(j))
				j++;
		}
		return n-j;
	}
}
