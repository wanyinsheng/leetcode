package leet_202209;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/9/13 23:06
 * @Version 1.0
 **/
public class ReorderSpaces {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        //单词个数
        int wordsCount = words.length;
        //空格个数
        int blackCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                blackCount++;
            }
        }
        StringBuilder sb = new StringBuilder();
        //考虑只有一个单词的情况
        if (words.length == 1) {
            sb.append(words[0]);
            for (int i = 0; i < blackCount; i++) {
                sb.append(' ');
            }
            return sb.toString();
        }

        int distance = (blackCount) / (wordsCount - 1);
        int remainder = blackCount % (wordsCount - 1);
        System.out.println(remainder);
        for (int i = 0; i < words.length-1; i++) {
            sb.append(words[i]);
            for (int j = 0; j < distance; j++) {
                sb.append(' ');
            }
        }
        //添加最后一个单词
        sb.append(words[words.length-1]);
        for (int i = 0; i <remainder ; i++) {
            sb.append(' ');
        }
        return sb.toString();

    }
}
