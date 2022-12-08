package leet_202209;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/9/6 10:48
 * @Version 1.0
 **/
public class FindSwapValues {
    public int[] findSwapValues(int[] array1, int[] array2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int num: array1) {
            sum1 += num;
        }
        for (int num: array2) {
            sum2 += num;
        }
        int diff = (sum1 - sum2) ;
        int[] res = new int[2];
        if (diff %2!= 0)
            return new int[0];
        diff = (sum1 - sum2)/2 ;
        Set<Integer> a2 = new HashSet<Integer>();
        for (int num: array2) {
            a2.add(num);
        }
        for (int n: array1) {
            if (a2.contains(n - diff)){
                res[0] = n;
                res[1] = n - diff;
                return res;
            }
        }
        return  new int[0];

    }
}
