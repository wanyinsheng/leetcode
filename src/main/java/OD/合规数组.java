package OD;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2023/3/31 11:23
 * @Version 1.0
 **/
public class 合规数组 {
    public static void main(String[] args) {

    }

    static String method(int[] nums) {
        //去重排序
        int[] arr = Arrays.stream(nums).distinct().sorted().toArray();
        String res = "0";
        for (int i = arr.length - 1; i >= 0; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    if (a == b + 2 * c) {
                        res = a + " " + b + " " + c;
                    }
                }
            }
        }
        return res;

    }
}
