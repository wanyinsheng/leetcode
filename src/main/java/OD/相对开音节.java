package OD;

import java.util.Scanner;

/**
 * @Author wanys
 * @Date 2023/4/13 10:06
 * @Version 1.0
 **/
public class 相对开音节 {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        method(input);
    }

    private static void method(String[] input) {
        int num = 0;
        for (int i = 0; i < input.length; i++) {
            String word = input[i];
            //长度小于4不用考虑
            if (word.length() < 4) {
                continue;
            }
            //非小写字母不考虑
            if (!word.matches("[a-z+]")) {
                continue;
            }
            //反转
            StringBuilder stringBuilder = new StringBuilder(word);
            word = stringBuilder.reverse().toString();
            //统计子结构
            String childWord;
            for (int j = 0; j < word.length(); j++) {
                if (j + 4 > word.length()) {
                    break;
                }
                childWord = word.substring(j, j + 4);
                //第一个是辅音
                if (childWord.substring(0, 1).matches("[aeiou]")) {
                    continue;
                }
                //第二个为元音
                if (childWord.substring(1, 2).matches("[aeiou]")) {
                    continue;
                }
                //第三个为辅音，r也除外
                if (childWord.substring(2, 3).matches("[aeiour]")) {
                    continue;
                }
                //如果第4个是e
                if (!childWord.substring(3, 4).matches("[e]")) {
                    continue;
                }
                num++;
            }

        }
        System.out.println(num);
    }
}
