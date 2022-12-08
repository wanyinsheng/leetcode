package leet_202210;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/10/22 01:08
 * @Version 1.0
 **/
public class HalfQuestions {
    public int halfQuestions(int[] questions) {
        // 知识点数组
        int[] nums = new int[1001];
        for (int x : questions) nums[x]++;
        // 数量和
        int sum = 0;
        // 知识点
        int count = 0;
        // 排序
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            count++;
            // 当此时的数量和超过问题数/2
            if (sum >= questions.length / 2)
                break;
        }
        return count;
    }
}
