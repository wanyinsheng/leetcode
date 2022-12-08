package leet_202209;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/9/14 18:07
 * @Version 1.0
 **/
public class TrimMean {
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int partialSum = 0;
        for (int i = n / 20; i < 19 * n / 20; i++) {
            partialSum += arr[i];
        }
        return partialSum / (n * 0.9);

    }
}
