package OD;

import java.util.*;

/**
 * @Author wanys
 * @Date 2023/3/30 16:22
 * @Version 1.0
 **/
public class 分班 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = scanner.nextLine().split(" ");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int val = 0;
        for (int i = 0; i < lines.length; i++) {
            String[] numbers = lines[i].split("/");
            //第一个
            if (0 == i) {
                list1.add(Integer.parseInt(numbers[0]));//添加学号
                val = 1;
                continue;
            }


            if (val == 1) {
                if ("Y".equals(numbers[1])) {
                    list1.add(Integer.parseInt(numbers[0]));//添加学号
                } else {
                    list2.add(Integer.parseInt(numbers[0]));//添加学号
                    val = 2;
                }
            } else {//N
                if ("Y".equals(numbers[1])) {
                    list2.add(Integer.parseInt(numbers[0]));//添加学号
                } else {
                    list1.add(Integer.parseInt(numbers[0]));//添加学号
                    val = 1;
                }
            }

        }

        //排序输出
        Collections.sort(list1);
        Collections.sort(list2);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }

}
