package leet_202212;

/**
 * 2481. 分割圆的最少切割次数
 */
public class NumberOfCuts {
	//n 为偶数时，每一块扇形都有对称的扇形，所以是切割 n/2
	//为奇数时，不存在对称性，所以是切割 nn 次
	//n=1时无需切割
	public int numberOfCuts(int n) {
		if(n==1)
			return 0;
		return n%2==0?n/2:n;
	}
}
