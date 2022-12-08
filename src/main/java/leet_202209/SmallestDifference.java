package leet_202209;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/9/7 09:54
 * @Version 1.0
 **/
public class SmallestDifference {
    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        long ans = Long.MAX_VALUE;
        for (int i = 0, j = 0; i < a.length && j < b.length; ) {
            long currDiff = a[i] -b[j];
            //更新最小值
            System.out.println(Math.abs(currDiff));
            ans = Math.min(ans, Math.abs(currDiff));
            if (currDiff > 0) {
                j++;
            } else {
                i++;
            }
        }
        return (int)ans;
    }
}
