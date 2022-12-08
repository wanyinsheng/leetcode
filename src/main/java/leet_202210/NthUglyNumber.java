package leet_202210;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/10/17 10:32
 * @Version 1.0
 **/
public class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        Set<Long> set=new HashSet<Long>();
        //最小堆
        PriorityQueue<Long> heap = new PriorityQueue<>();
        //先将最小的丑数入堆
        set.add(1L);
        heap.add(1L);
        int ugly=0;
        for (int i = 0; i <n ; i++) {
            long poll = heap.poll();
            ugly=(int)poll;
            for (int factor : factors) {
                long next = poll * factor;
                //判断是否已经在堆中
                if (set.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }
}
