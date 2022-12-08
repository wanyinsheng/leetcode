package leet_202208;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wanys
 * @Date 2022/8/30 15:39
 * @Version 1.0
 **/
public class ExpectNumber {
    public int expectNumber(int[] scores) {
        //其实就是求不同元素个数
        Set<Integer> set=new HashSet<>();
        for(int score:scores){
            set.add(score);
        }
        return set.size();
    }

}
