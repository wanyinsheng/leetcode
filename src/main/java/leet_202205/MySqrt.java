package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/3 5:05 PM
 * @Version 1.0
 **/
public class MySqrt {

    public int mySqrt(int x) {
        int left = 0;
        int ans = 0;
        int right = x;//上限看成x
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        return ans;

    }
}
