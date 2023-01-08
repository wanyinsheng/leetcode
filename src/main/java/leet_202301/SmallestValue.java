package leet_202301;

/**
 * 2507. 使用质因数之和替换后可以取到的最小值
 *
 * @Author wanys
 * @Date 2023/1/8 09:39
 * @Version 1.0
 **/
public class SmallestValue {
    public int smallestValue(int n) {
        while (true) {
            int sum = 0;
            int x = n;
            for (int i = 2; i * i <= x; i++) {//最小的质数2，遍历到根号x
                while (x % i == 0) {//优先考虑从最小的质数开始
                    sum += i;
                    x = x / i;
                }
            }//end for
            if(x>1){//还有剩余的，那就加入到sum中
                sum+=x;
            }
            if(sum==n){//循环了一次之后结果没有变化，那就找到了最小的数sum
                return n;
            }
            n=sum;
        }
    }
}
