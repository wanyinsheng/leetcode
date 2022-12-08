package leet_202210;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author wanys
 * @Date 2022/10/16 10:08
 * @Version 1.0
 **/
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int  n=nums.length;
        PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o1[1];
            }
        });
        //前k个元素入队列
        for (int i = 0; i <k; i++) {
            queue.offer(new int[]{nums[i],i});
        }
        //结果数组
        int[] ans=new int[n-k+1];
        ans[0]=queue.peek()[0];
        for (int i = k; i <n ; i++) {
            queue.offer(new int[]{nums[i],i});
            //循环删除窗口左侧的元素
            while (queue.peek()[1] <= i - k) {
                queue.poll();
            }
            ans[i - k + 1] = queue.peek()[0];
        }
        return ans;
    }
}
