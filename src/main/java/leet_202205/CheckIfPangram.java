package leet_202205;

/**
 * 1832. 判断句子是否为全字母句
 * @Author wanys
 * @Date 2022/5/20 5:01 PM
 * @Version 1.0
 **/
public class CheckIfPangram {
    public boolean checkIfPangram(String sentence) {
        int[]letters=new int[26];
        for (int i = 0; i <sentence.length() ; i++) {
            letters[sentence.charAt(i)-'a']++;
        }
        for (int i = 0; i <26 ; i++) {
            if(letters[i]==0)
                return false;
        }
        return true;
    }
}
