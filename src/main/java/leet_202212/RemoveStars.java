package leet_202212;

import java.util.Stack;

public class RemoveStars {
	public String removeStars(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if(c=='*'){
				stack.pop();
			}else{
				stack.push(c);
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		while (!stack.isEmpty()){
			stringBuilder.append(stack.pop());
		}
		return stringBuilder.reverse().toString();
	}

}
