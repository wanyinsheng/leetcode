package leet_202301;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 1389. 按既定顺序创建目标数组
 * @Author wanys
 * @Date 2023/1/5 15:43
 * @Version 1.0
 **/
public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            list.add(index[i], nums[i]);//利用了list想i位置处插入数据的api
        }
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            ret[i] = list.get(i);
        }

        return ret;


    }
}
