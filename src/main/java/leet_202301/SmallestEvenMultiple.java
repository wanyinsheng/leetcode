package leet_202301;

/**
 * @Author wanys
 * @Date 2023/1/4 14:52
 * @Version 1.0
 **/
public class SmallestEvenMultiple {
    //当 n 为奇数时，答案为 2n，当 n 为偶数时，答案为 n。
    public int smallestEvenMultiple(int n) {
        return (n%2+1)*n;
    }
}
