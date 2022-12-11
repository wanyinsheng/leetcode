package leet_202205;

import java.util.HashSet;
import java.util.List;

/**
 * 1436. 旅行终点站
 * @Author wanys
 * @Date 2022/5/21 2:23 PM
 * @Version 1.0
 **/
public class DestCity {

    //终点不会成为起始点
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        for (List<String> path : paths) {
            set.add(path.get(0));
        }
        for (List<String> path : paths) {
            //终点不会是起始点
            if (!set.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";


    }
}
