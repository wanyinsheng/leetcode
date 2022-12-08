package leet_202209;

/**
 * @Author wanys
 * @Date 2022/9/7 10:48
 * @Version 1.0
 **/
public class SubSort {
    public int[] subSort(int[] array) {
        if(array == null || array.length == 0)
            return new int[]{-1, -1};
        int last = -1, first = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = array.length;
        //左侧找最大值为判断边界，右边找最小值为判断边界
        for(int i = 0; i < len; i++){
            //从前往后找最大值
            if(array[i] < max){
                last = i;
            }else{
                max = Math.max(max, array[i]);
            }
            //从右往左找最小值
            if(array[len - 1 - i] > min){
                first = len - 1 - i;
            }else{
                min = Math.min(min, array[len - 1 - i]);
            }
        }
        return new int[] {first, last};
    }
}
