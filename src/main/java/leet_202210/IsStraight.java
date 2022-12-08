package leet_202210;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/10/17 09:31
 * @Version 1.0
 **/
public class IsStraight {
    public boolean isStraight(int[] nums) {
        int joker = 0;
        //数组排序
        Arrays.sort(nums);
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                joker++; // 统计大小王数量
            } else if (nums[i] == nums[i + 1]) {
                return false; // 若有重复，提前返回 false
            }
        }
        return nums[4] - nums[joker] < 5; // 最大牌 - 最小牌 < 5 则可构成顺子

    }
}
