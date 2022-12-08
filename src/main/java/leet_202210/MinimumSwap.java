package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/17 19:49
 * @Version 1.0
 **/
public class MinimumSwap {
    public int minimumSwap(String s1, String s2) {
        int x=0;
        int y=0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) == 'x') {
                    x++;
                } else {
                    y++;
                }
            }
        }
        //统计出来了s1字符串与s2字符串中不同元素的x和y的个数,如果x和y的奇偶性不一样，不能交换
        if ((x & 1) != (y & 1)) {
            return -1;
        }

//        1.a,b 都是偶数，那么最后什么都没剩下，不需要额外操作了。
//        2.a,b 一奇一偶，最后只会剩下一对不匹配字符，这样是无解的。
//        3.a,b 都是奇数，那么最后会剩下一对 x - y 和一对 y - x，需要额外 2 次操作。
        return x / 2 + y / 2 + x % 2 + y % 2;
    }
    public static void main(String[] args) {
        int x=3;
        System.out.println(x & 1);//偶数为0，奇数为1
        System.out.println(4 & 1);//0
        System.out.println(1 & 1);//1
    }
}
