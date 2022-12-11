package leet_202206;

/**
 * 面试题 01.02. 判定是否互为字符重排
 * @Author wanys
 * @Date 2022/6/15 7:33 AM
 * @Version 1.0
 **/
public class CheckPermutation {


    public boolean CheckPermutation(String s1, String s2) {
        //先考虑长度
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] table=new int[26];
        for (int i = 0; i <s1.length() ; i++) {
            table[s1.charAt(i)-'a']++;
        }
        for (int i = 0; i <s2.length() ; i++) {
            table[s2.charAt(i) - 'a']--;
            if (table[s2.charAt(i) - 'a'] < 0) {
                return false;
            }

        }
        return true;

    }
}
