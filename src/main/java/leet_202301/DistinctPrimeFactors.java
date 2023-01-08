package leet_202301;

import java.util.HashSet;

/**
 * 2521. 数组乘积中的不同质因数数目
 *
 * @Author wanys
 * @Date 2023/1/8 09:22
 * @Version 1.0
 **/
public class DistinctPrimeFactors {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> set = new HashSet<>();//需要去重
        for (int x : nums) {
            for (int i = 2; i * i <= x; i++) {//质因数
                if (x % i == 0) {
                    set.add(i);
                    while (x % i == 0) {
                        x /= i;
                    }
                }
            }
            if (x > 1) {
                set.add(x);
            }
        }
        return set.size();
    }
}
