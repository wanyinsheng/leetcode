package leet_202301;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author wanys
 * @Date 2023/1/4 21:07
 * @Version 1.0
 **/
public class SortPeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer, String> map = new HashMap<>();
        //map存储了对用关系
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        //按照身高升序
        Arrays.sort(heights);

        for (int i = 0; i < n; i++) {
            //这里对names进行了修改，重新赋值了
            names[n - 1 - i] = map.get(heights[i]);
        }
        return names;
    }


}
