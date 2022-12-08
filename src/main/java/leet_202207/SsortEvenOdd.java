package leet_202207;

import java.util.PriorityQueue;

/**
 * 2164. 对奇偶下标分别排序
 *
 * @Author wanys
 * @Date 2022/7/2 10:37 上午
 * @Version 1.0
 **/
public class SsortEvenOdd {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        //小根堆，非递减
        PriorityQueue<Integer> ou = new PriorityQueue<>();
        //大根堆，非递增
        PriorityQueue<Integer> ji = new PriorityQueue<>((a, b)->{
            return b - a;
        });

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) ou.offer(nums[i]);
            else ji.offer(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) nums[i] = ou.poll();
            else nums[i] = ji.poll();
        }

        return nums;

    }
}
