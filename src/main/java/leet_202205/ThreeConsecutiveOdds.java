package leet_202205;

/**
 * 1550. 存在连续三个奇数的数组
 * @Author wanys
 * @Date 2022/5/20 4:01 PM
 * @Version 1.0
 **/
public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n - 3; i++) {
            if ((arr[i] & 1) != 0 && (arr[i + 1] & 1) != 0 && (arr[i + 2] & 1) != 0) {
                return true;
            }
        }
        return false;


    }
}
