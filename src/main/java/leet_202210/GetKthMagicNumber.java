package leet_202210;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/10/19 22:27
 * @Version 1.0
 **/
public class GetKthMagicNumber {
    public int getKthMagicNumber(int k) {
        int[] factors = {3, 5, 7};
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();//最小堆
        heap.offer(1L);
        set.add(1L);
        int magic=0;
        for (int i = 0; i < k; i++) {
            long cur = heap.poll();//弹出堆里最小的元素
            magic = (int) cur;
            for (int factor : factors) {
                long next = cur * factor;
                if (set.add(next))//这里要进行去重的
                    heap.offer(next);
            }
        }
        return magic;
    }
}
