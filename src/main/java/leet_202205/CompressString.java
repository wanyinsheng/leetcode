package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 3:41 PM
 * @Version 1.0
 **/
public class CompressString {
    public String compressString(String S) {
        if (S.length() == 0) { // 空串处理
            return S;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int cnt = 1;
        char ch= S.charAt(0);
        for (int i = 1; i < S.length(); i++) {
            if(ch==S.charAt(i)){
                cnt++;
            }else{
                stringBuffer.append(ch);
                stringBuffer.append(cnt);
                ch=S.charAt(i);
                cnt=1;
            }
        }
        stringBuffer.append(ch);
        stringBuffer.append(cnt);
        return stringBuffer.length()>=S.length()?S:stringBuffer.toString();
    }
}
