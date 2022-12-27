package leet_202212;

/**
 * 1897. 重新分配字符使所有字符串都相等
 */
public class MakeEqual {
	public boolean makeEqual(String[] words) {
		int len = words.length;
		int[] charCount = new int[26];
		for (String word : words) {
			for (char c : word.toCharArray()) {
				charCount[c-'a']++;
			}
		}
		for (int count : charCount) {
			if ( count % len != 0)
				return false;
		}
		return true;

	}
}
