package leet_202301;

/**
 * @Author wanys
 * @Date 2023/1/8 11:22
 * @Version 1.0
 **/
public class ClosestPrimes {
    private final static int MX = (int) 1e6;
    private final static int[] primes = new int[78500];
    //预处理1e6以内的所有质数
    static {
        boolean[] np = new boolean[MX + 1];
        int pi = 0;
        for (int i = 2; i <= MX; ++i) {
            if (!np[i]) {
                primes[pi++] = i;
                for (int j = i; j <= MX / i; ++j) { // 避免溢出的写法
                    np[i * j] = true;
                }
            }
        }
        // 额外在加两个数  保证下面下标不会越界
        primes[pi++] = MX + 1;
        primes[pi++] = MX + 1;
    }

    public int[] closestPrimes(int left, int right) {
        int p = -1, q = -1;
        for (int i = lowerBound(primes, left); primes[i + 1] <= right; ++i) {
            if (p < 0 || primes[i + 1] - primes[i] < q - p) {
                p = primes[i];
                q = primes[i + 1];
            }
        }
        return new int[]{p, q};
    }

    // 见 https://www.bilibili.com/video/BV1AP41137w7/
    private int lowerBound(int[] nums, int target) {
        int left = -1, right = nums.length; // 开区间 (left, right)
        while (left + 1 < right) { // 区间不为空
            // 循环不变量：
            // nums[left] < target
            // nums[right] >= target
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid; // 范围缩小到 (mid, right)
            } else {
                right = mid; // 范围缩小到 (left, mid)
            }
        }
        return right;
    }

}
