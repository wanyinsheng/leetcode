package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/3/30 16:36
 * @Version 1.0
 **/
public class 字符串分割 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int num = scanner.nextInt();
        System.out.println(method(line, num));


    }

    static String method(String str, int k) {
        //
        String[] arr = str.split("-");
        StringBuilder res = new StringBuilder();
        res.append(arr[0]);//第一个
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }
        //双指针
        int left = 0;
        int right = left + k;
        while (right < stringBuilder.length()) {
            String subSrt = stringBuilder.substring(left, right);
            String count = count(subSrt, k);
            res.append("-").append(count);
            left += k;
            right=left+k;
        }
        if(left<stringBuilder.length()){
            res.append("-").append(stringBuilder.substring(left));
        }
        return res.toString();
    }

    /**
     * 统计字母个数并大小写转换
     */
    static String count(String str, int k) {
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upper++;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lower++;
            }
        }
        if (upper > lower) {
            return str.toUpperCase();
        } else if (upper < lower) {
            return str.toLowerCase();
        } else {
            return str;
        }

    }
}
