package leet_202203;

/**
 * 1576. 替换所有的问号
 * @Author wanys
 * @Date 2022/3/29 9:16 PM
 * @Version 1.0
 **/
public class ModifyString {
    public String modifyString(String s) {
        //先转成数组操作
        char[] chars = s.toCharArray();
        for (int i = 0; i <s.length() ; i++) {
            if(chars[i]=='?'){
                //遍历从a-c中选择一个
                for (char ch = 'a'; ch <= 'c'; ++ch) {
                    //提出掉不可以选择的字符
                    if ((i > 0 && chars[i - 1] == ch) || (i < s.length() - 1 && chars[i + 1] == ch)) {
                        continue;
                    }
                    chars[i]=ch;
                    break;//跳出当前循环
                }
            }
        }
        return new String(chars);
    }
}
