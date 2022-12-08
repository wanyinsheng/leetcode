package leet_202208;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author wanys
 * @Date 2022/8/2 10:29
 * @Version 1.0
 **/
public class LeastBricks {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (List<Integer> widths : wall) {
            int n = widths.size();
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {//最后一块转不统计
                sum += widths.get(i);
                cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);//因为每一行的sum是不重复的
            }

        }
        //map的遍历
        int maxCnt = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            maxCnt = Math.max(maxCnt, entry.getValue());//取value的最大值
        }
        return wall.size() - maxCnt;


    }
}
