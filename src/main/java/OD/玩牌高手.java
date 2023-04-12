package OD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/21 10:53
 * @Version 1.0
 **/
public class 玩牌高手 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(",");
        int len = values.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(values[i]);
        }
        method(values, nums, len);
    }

    static void method(String[] values, int[] nums, int len) {
        List<Integer> list = new ArrayList<>();
        if (Integer.parseInt(values[0]) <= 0) {
            list.add(0);
        } else {
            list.add(nums[0]);
        }
        for (int j = 1; j < len; j++) {
            int count = list.get(j - 1) + nums[j];
            if (j >= 3) {
                list.add(count > list.get(j - 3) ? count : list.get(j - 3));
            } else {
                list.add(Math.max(count, 0));
            }
        }
        System.out.println(list.get(len-1));
    }
}
