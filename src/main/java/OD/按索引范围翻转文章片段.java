package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/30 10:34
 * @Version 1.0
 **/
public class 按索引范围翻转文章片段 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String lines=scanner.nextLine();
        String left=scanner.nextLine();
        String right=scanner.nextLine();
        System.out.println(reverseString(lines,Integer.parseInt(left),Integer.parseInt(right)));

    }

    static String reverseString(String str, int left, int right) {
        String[] content = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        while (right > left) {
            String temp = "";
            temp = content[right];
            content[right] = content[left];
            content[left] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < content.length; i++) {
            stringBuilder.append(content[i]);
            if (i < content.length - 1) {//非最后一个添加空格
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
