package leet_202301;

/**
 * 1957. 删除字符使字符串变好
 *
 * @Author wanys
 * @Date 2023/1/6 22:18
 * @Version 1.0
 **/
public class MakeFancyString {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int n = sb.length();
            //如果遇到了连续相同的第三个数，就跳过
            if (n >= 2 && sb.charAt(n - 1) == s.charAt(i) && sb.charAt(n - 2) == s.charAt(i)) {
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
