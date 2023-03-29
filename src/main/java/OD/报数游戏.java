package OD;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/29 16:37
 * @Version 1.0
 **/
public class 报数游戏 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num <= 1 || num >= 100) {
            System.out.println("ERROR!");
            return;
        }
        Map map = new HashMap<Integer, Integer>();
        // 1 to  100
        for (int i = 0; i < 100; i++) {
            map.put(i + 1, i + 1);
        }
    }
}
