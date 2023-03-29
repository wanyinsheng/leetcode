package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/29 15:46
 * @Version 1.0
 **/
public class 分糖果 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(candy(num));
    }

    public static int candy(int n) {
        int index = 0;
        for (int i = n; i != 1; i /= 2, index++) {
            if (n == 3) {
                return index += 3;
            }
            if (i % 2 != 0) {
                if ((i + 1) / 2 % 2 == 0) {
                    i++;
                } else {
                    i--;
                }
                index++;
            }
        }
        return index;
    }


}
