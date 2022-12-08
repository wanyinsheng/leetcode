package leet_202209;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author wanys
 * @Date 2022/9/6 10:03
 * @Version 1.0
 **/
public class SmallestK {
    public int[] smallestK(int[] arr, int k) {
        int[] ans=new int[k];
        if(k==0)
            return ans;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;//大根堆
            }
        });
        //先添加k个元素
        for (int i = 0; i <k ; i++) {
            queue.add(arr[i]);
            //queue.offer(arr[i]);
        }
        for (int i = k; i <arr.length ; i++) {
            if(queue.peek()>arr[i]){
                //移除堆顶较大元素
                queue.poll();
                queue.add(arr[i]);
                //queue.offer(arr[i]);
            }
        }
        //从优先队列添加到结果数组
        for (int i = 0; i <k ; i++) {
            ans[i]=queue.poll();
        }
        return ans;

    }
}
