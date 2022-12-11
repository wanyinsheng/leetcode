package leet_202205;

import java.util.PriorityQueue;

/**
 * 面试题 17.20. 连续中值
 *
 * @Author wanys
 * @Date 2022/5/22 12:49 PM
 * @Version 1.0
 **/
public class MedianFinder {
    //使用两个优先队列

    PriorityQueue<Integer> maxQueue;
    PriorityQueue<Integer> minQueue;

    public MedianFinder() {
        maxQueue = new PriorityQueue<Integer>((a, b) -> (a - b));//从小到达，默认是升序的
        minQueue = new PriorityQueue<Integer>((a, b) -> (b - a));
    }

    public void addNum(int num) {
        if (minQueue.isEmpty() || num < minQueue.peek()) {//小于较小一半的最大值
            minQueue.offer(num);
            if (minQueue.size() > maxQueue.size() + 1) {//考虑是否将最大的一个移动到大队列
                maxQueue.offer(minQueue.poll());
            }
        } else {//添加到大队列
            maxQueue.offer(num);
            if(minQueue.size()<maxQueue.size()){//必须保证minSize-maxSize<=1
                minQueue.offer(maxQueue.poll());
            }

        }

    }


    public double findMedian() {
        if (minQueue.size() > maxQueue.size()) {//较小的那一半队列可能会多保存一个
            return minQueue.peek();
        } else {
            return (minQueue.peek() + maxQueue.peek()) / 2.0;
        }
    }
}
