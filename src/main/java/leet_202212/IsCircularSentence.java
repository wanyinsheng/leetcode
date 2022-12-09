package leet_202212;

/**
 * 2490. 回环句
 */
public class IsCircularSentence {
	public boolean isCircularSentence(String sentence) {
		//第一个和最后一个不相等
		if(sentence.charAt(sentence.length()-1)!=sentence.charAt(0))
			return false;
		//中间字符可以通过找空格位置来判断
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)==' '&&sentence.charAt(i-1)!=sentence.charAt(i+1)){
				return false;
			}
		}
		return true;
	}
}
