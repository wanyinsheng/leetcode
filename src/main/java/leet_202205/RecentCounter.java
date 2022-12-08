package leet_202205;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 剑指 Offer II 042. 最近请求次数
 * @Author wanys
 * @Date 2022/5/22 11:51 AM
 * @Version 1.0
 **/
public class RecentCounter {
    //适用LinkedList来保存信息
    Queue<Integer> queue;

    public RecentCounter() {

        queue=new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);
        //这里需要不断的移除窗口左侧失效的数据流
        while( t-3000 >queue.peek()){
            //移除窗口左边的元素
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        boolean offer = list.offer(1);
        Integer peek = list.peek();
        System.out.println( peek>2-2);
    }
}
