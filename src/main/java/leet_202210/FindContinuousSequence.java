package leet_202210;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author wanys
 * @Date 2022/10/16 09:43
 * @Version 1.0
 **/
public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        for (int left = 1, right = 2; left < right;) {
            int sum = (left + right) * (right - left + 1) / 2;//求连续和
            if (sum == target) {
                int[] res=new int[right-left+1];//集合数组
                //填充数组
                for (int i = left; i <=right ; i++) {
                    res[i-left]=i;
                }
                //添加到结果集
                result.add(res);
                //修改偏移量，继续找下一组
                left++;
            } else if (sum < target) {//右指针右移
                right ++;
            } else {//左指针右移
                left++;
            }

        }
        //转成数组*****
        return result.toArray(new int[result.size()][]);
    }
}
