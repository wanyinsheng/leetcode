package leet_202206;

import java.util.PriorityQueue;

/**
 * @Author wanys
 * @Date 2022/6/30 2:42 PM
 * @Version 1.0
 **/
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        //先入队列k个元素
        for (int i = 0; i <k ; i++) {
            minHeap.offer(nums[i]);
        }
        for (int i = k; i <n ; i++) {
            Integer peek = minHeap.peek();
            if(nums[i]>peek){
                minHeap.poll();//poll出来一个最小的
                minHeap.offer(nums[i]);
            }
        }
        return minHeap.peek();

    }
}
