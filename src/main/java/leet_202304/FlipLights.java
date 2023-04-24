package leet_202304;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 672. 灯泡开关 Ⅱ
 *
 * @Author wanys
 * @Date 2023/4/24 14:44
 * @Version 1.0
 **/
public class FlipLights {
    /**
    首先，不需要考虑按钮按动的顺序，而只需要考虑每个按钮被按了几次，
    在按钮按动次数一样的情况下，顺序不影响灯泡最后的状态。
    更进一步地，不需要考虑每个按钮具体被按了几次，而只需要考虑被按了奇数次还是偶数次即可，
    某个键每多按或少按2 次及其倍数次，也不影响最后的状态。
    */
    public int flipLights(int n, int presses) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 1 << 4; i++) {
            int[] pressArr = new int[4];
            for (int j = 0; j < 4; j++) {
                pressArr[j] = (i >> j) & 1;
            }
            int sum = Arrays.stream(pressArr).sum();
            if (sum % 2 == presses % 2 && sum <= presses) {
                int status = pressArr[0] ^ pressArr[2] ^ pressArr[3];
                if (n >= 2) {
                    status |= (pressArr[0] ^ pressArr[1]) << 1;
                }
                if (n >= 3) {
                    status |= (pressArr[0] ^ pressArr[2]) << 2;
                }
                if (n >= 4) {
                    status |= (pressArr[0] ^ pressArr[1] ^ pressArr[3]) << 3;
                }
                set.add(status);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {

    }
}
