package leet_202212;

/**
 * 1614. 括号的最大嵌套深度
 */
public class MaxDepth {
	public int maxDepth(String s) {
		int ans=0;
		int size=0;//当前栈大小
		for(char c:s.toCharArray()){
			if(c=='('){
				size++;
				ans=Math.max(ans,size);
			}else if(c==')') {
				size--;
			}
		}
		return ans;
	}

}
