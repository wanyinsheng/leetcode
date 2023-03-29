package OD;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/29 15:53
 * @Version 1.0
 **/
public class 快递运输 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        int weight = scanner.nextInt();

    }

    public static int delivery(int[] arr, int weight) {
        Arrays.sort(arr);
        int sum = Arrays.stream(arr).sum();
        int allSum = 0;
        for (int i = arr.length - 1; i >= 0; i++) {
            if (sum - allSum < weight) {
                return i + 1;
            } else {
                allSum += arr[i];
            }
        }
        return 0;
    }


}
