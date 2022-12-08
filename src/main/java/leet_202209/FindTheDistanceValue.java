package leet_202209;

import java.util.Arrays;

/**
 * 1385. 两个数组间的距离值
 *
 * @Author wanys
 * @Date 2022/9/5 09:50
 * @Version 1.0
 **/
public class FindTheDistanceValue {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0;
        for (int x : arr1) {
            boolean flag = true;
            for (int y : arr2) {
                if (Math.abs(x - y) <= d) {
                    flag = false;
                }
            }
            if (flag == true) {
                cnt++;
            }
        }
        return cnt;
    }


    public int findTheDistanceValue1(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        return 0;
    }
}
