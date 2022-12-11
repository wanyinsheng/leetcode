package leet_202206;

/**
 * 1323. 6 和 9 组成的最大数字
 * @Author wanys
 * @Date 2022/6/14 10:20 PM
 * @Version 1.0
 **/
public class Maximum69Number {

    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]=='6'){
                chars[i]='9';
                break;
            }
        }
        return Integer.valueOf(new String(chars));
    }
}
