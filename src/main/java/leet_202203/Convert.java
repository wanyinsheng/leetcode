package leet_202203;

/**
 * 6. Z 字形变换
 *
 * @Author wanys
 * @Date 2022/3/29 12:47 PM
 * @Version 1.0
 **/
public class Convert {

    /**
     * 0   4   8      12
     * 1 3 5 7 9  11  13
     * 2   6   10     14
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        int n = s.length();
        if (numRows == 1 || numRows > n)
            return s;
        StringBuffer ans = new StringBuffer();
        int t = numRows * 2 - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += t) {
                ans.append(s.charAt(j + i));//第一行
                if (0 < i && i < numRows - 1 && j + t - i < n) {
                    ans.append(s.charAt(j + t - i)); // 当前周期的第二个字符

                }
            }
        }
        return ans.toString();
    }
}
