package leet_202207;

import java.util.ArrayList;
import java.util.List;

/**
 * 2032. 至少在两个数组中出现的值
 * @Author wanys
 * @Date 2022/7/4 10:54 上午
 * @Version 1.0
 **/
public class TwoOutOfThree {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<>();
        int[] cache = new int[101];
        for (int x : nums1) {
            cache[x] = 1;
        }
        //判断是否在第二个数组中出现了
        for (int x : nums2) {
            if(cache[x]==1) {
                res.add(x);
                cache[x] = -1;//标记为已经添加，后边就不会在重复添加了
            }else if(cache[x]==0){
                cache[x]=2;//数组2中第一次出现
            }

        }
        for (int x : nums3) {
            if(cache[x]==1||cache[x]==2) {
                res.add(x);
                //cache[x]=-1;//避免重复元素
            }

        }
        return res;

    }
}
