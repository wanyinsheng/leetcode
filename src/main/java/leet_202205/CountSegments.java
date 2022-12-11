package leet_202205;

/**
 * 434. 字符串中的单词数
 * @Author wanys
 * @Date 2022/5/20 4:16 PM
 * @Version 1.0
 **/
public class CountSegments {

    public int countSegments(String s) {
        int cnt=0;
        for (int i = 0; i <s.length() ; i++) {
            if(i==0||s.charAt(i-1)==' '&&s.charAt(i)!=' ')
                cnt++;
        }
        return cnt;
    }
}
