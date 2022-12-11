package leet_202207;

/**
 * @Author wanys
 * @Date 2022/7/1 1:54 PM
 * @Version 1.0
 **/
public class AddBinary {

    /**
     * 模拟
     *
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int n = Math.max(a.length(), b.length());
        int carry = 0;
        for (int i = 0; i < n; i++) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }
        //最后可能会有一个单独的进位
        if (carry > 0) {
            ans.append('1');
        }
        //反转
        ans.reverse();
        return ans.toString();

    }
}
