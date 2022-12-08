package leet_202205;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 剑指 Offer II 041. 滑动窗口的平均值
 * @Author wanys
 * @Date 2022/5/21 8:24 PM
 * @Version 1.0
 **/
public class MovingAverage {
    Queue<Integer> queue=null;
    int size=0;//窗口大小
    int sum=0;//窗口内的和
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        //还不计算，我就不初始化
        this.size=size;
        sum=0;
        queue=new LinkedList<>();
    }

    public double next(int val) {
        //考虑是否移除老元素
        if(queue.size()==size)
            sum-=queue.remove();
        //进入窗口
        queue.add(val);
        sum+=val;
        //返回当前窗口平均值
        return sum/queue.size();
    }
}
