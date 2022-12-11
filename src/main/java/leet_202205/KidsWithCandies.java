package leet_202205;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author wanys
 * @Date 2022/5/21 1:32 PM
 * @Version 1.0
 **/
public class KidsWithCandies {


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        LinkedList<Boolean> list = new LinkedList<>();
        //找出拥有糖果最多的孩子
        int maxCandie=0;
        for (int i = 0; i <candies.length ; i++) {
            if(candies[i]>maxCandie)
                maxCandie=candies[i];
        }
        //对每个人都去分
        for (int i = 0; i <candies.length ; i++) {
            int least=maxCandie-extraCandies;
            if(candies[i]>=least){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }

}
