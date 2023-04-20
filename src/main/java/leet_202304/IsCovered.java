package leet_202304;

/**
 * 1893. 检查是否区域内所有整数都被覆盖
 *
 * @Author wanys
 * @Date 2023/4/14 14:42
 * @Version 1.0
 **/
public class IsCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];   // 差分数组
        for (int[] range : ranges) {
            ++diff[range[0]];
            --diff[range[1] + 1];
        }
        // 前缀和
        int curr = 0;
        for (int i = 1; i <= 50; ++i) {
            curr += diff[i];
            if (i >= left && i <= right && curr <= 0) {
                return false;
            }
        }
        return true;
    }
}
