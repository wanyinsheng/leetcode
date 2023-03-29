package leet_202303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 17.15. 最长单词
 * @Author wanys
 * @Date 2023/3/7 11:05
 * @Version 1.0
 **/
public class LongestWord {
    public String longestWord(String[] words) {
        //先对字典排序，长度大的在前边，长度相同，字典序小的在前边
        Arrays.sort(words,(o1, o2)->{
            if(o1.length() == o2.length()) {
                return o1.compareTo(o2);//字典序小的在前边
            }else{
                return Integer.compare(o2.length(),o1.length());
            }
        });
        //使用set考虑去重
        Set<String> set =new HashSet<>(Arrays.asList(words));
        for(String word : words){
            set.remove(word);
            if(find(set,word)) {
                return word;
            }
        }
        return "";
    }
    public boolean find(Set<String> set, String word){
        if(word.length() == 0) {
            return true;
        }
        for(int i = 0; i < word.length(); i++){
            if(set.contains(word.substring(0,i+1)) && find(set,word.substring(i+1))) {//[0,i]  find[i+1,end]
                return true;
            }
        }
        return false;
    }
}
