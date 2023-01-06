package leet_202301;

import java.util.HashSet;
import java.util.Set;

/**
 * 1935. 可以输入的最大单词数
 *
 * @Author wanys
 * @Date 2023/1/6 22:06
 * @Version 1.0
 **/
public class CanBeTypedWords {
    public int canBeTypedWords(String text, String brokenLetters) {
        if (brokenLetters.length() == 0)
            return text.split(" ").length;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < brokenLetters.length(); i++) {
            set.add(brokenLetters.charAt(i));
        }
        String[] words = text.split(" ");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (set.contains(words[i].charAt(j))) {

                    flag = false;
                    break;
                }

            }
            if (flag)
                count++;
        }
        return count;


    }
}
