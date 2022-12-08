package leet_202203;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @Author wanys
 * @Date 2022/3/29 2:30 PM
 * @Version 1.0
 **/
public class LongestWord {
    public String longestWord(String[] words) {
        //先对数组进行排序，先按长度排序，在按字典序排序
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()){
                    return o1.length()-o2.length();
                }else{
                    return o2.compareTo(o1);
                }
            }
        });
        //排序之后进行操作
        String longest="";
        HashSet<String> set = new HashSet<String>();
        set.add("");
        int n=words.length;
        for(String word:words){
            if(set.contains(word.substring(0,word.length()-1))){
                set.add(word);
                longest=word;
            }
        }
        return longest;
    }
}
