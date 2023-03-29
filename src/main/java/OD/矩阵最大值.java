package OD;

/**
 * @Author wanys
 * @Date 2023/3/21 11:03
 * @Version 1.0
 **/
public class 矩阵最大值 {
    public static void main(String[] args) {
        //遍历每一行找最大值求和  （简单）
    }

    //找字符串二进制最大值
    static int find(String str) {
        int len = str.length();
        int max = Integer.parseInt(str, 2);
        int i = 1;
        while (i++ < len) {
            String nextStr = str.substring(i) + str.substring(0, i);
            max = Math.max(max,Integer.parseInt(nextStr,2));
        }
        return max;
    }
}
