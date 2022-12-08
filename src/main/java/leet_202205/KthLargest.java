package leet_202205;

import java.util.PriorityQueue;

/**
 * 剑指 Offer II 059. 数据流的第 K 大数值
 * @Author wanys
 * @Date 2022/5/22 12:24 PM
 * @Version 1.0
 **/
public class KthLargest {
    PriorityQueue<Integer>  priorityQueue;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        priorityQueue=new PriorityQueue<>();
        //添加到优先队列中
        for(int x:nums)
            add(x);

    }

    public int add(int val) {
        //先进队列
        priorityQueue.offer(val);
        if(priorityQueue.size()>k){
            priorityQueue.poll();//移除最小的，保证只有k个
        }
        //队列的顶头就是第k大
        return priorityQueue.peek();
    }

}
