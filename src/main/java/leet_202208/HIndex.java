package leet_202208;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/8/30 15:47
 * @Version 1.0
 **/
public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h=0;
        int i=citations.length-1;
        //从大到小遍历，直到h无法继续增大
        while(i>=0&&citations[i]>h){
            h++;
            i--;
        }
        return h;
    }
}
