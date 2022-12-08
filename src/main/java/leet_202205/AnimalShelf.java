package leet_202205;

import java.util.LinkedList;

/**
 * 面试题 03.06. 动物收容所
 * @Author wanys
 * @Date 2022/5/21 10:54 AM
 * @Version 1.0
 **/
public class AnimalShelf {
    LinkedList<int[]> dogQueue;
    LinkedList<int[]> catQueue;
    //初始化
    public AnimalShelf() {
        dogQueue = new LinkedList<>();
        catQueue = new LinkedList<int[]>();

    }

    public void enqueue(int[] animal) {
        //判断类别，放入到对应的队列
        if(animal[1]==0)
            catQueue.addLast(animal);
        if(animal[1]==1)
            dogQueue.addLast(animal);
    }

    public int[] dequeueAny() {
        //都为空
//        if(catQueue.isEmpty()&&dogQueue.isEmpty())
//            return new int[]{-1,-1};
        //猫是空
        if(catQueue.isEmpty()&&!dogQueue.isEmpty())
            return dogQueue.removeFirst();
        //狗是空
        if(!catQueue.isEmpty()&&dogQueue.isEmpty())
            return catQueue.removeFirst();
        //两个都不空
        if(!catQueue.isEmpty()&&!dogQueue.isEmpty()){
            int[] cat = catQueue.getFirst();
            int[] dog = dogQueue.getFirst();
            if(cat[0]<dog[0]){
                return catQueue.removeFirst();
            }else{
                return dogQueue.removeFirst();
            }
        }
        return new int[]{-1,-1};


    }

    public int[] dequeueDog() {
        if (!dogQueue.isEmpty()) {
            return dogQueue.removeFirst();
        } else {
            return new int[]{-1,-1};
        }



    }

    public int[] dequeueCat() {
        if (!catQueue.isEmpty()) {
            return catQueue.removeFirst();
        } else {
            return new int[]{-1,-1};
        }
    }


}
