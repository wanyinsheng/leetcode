package leet_202209;

/**
 * 1122. 数组的相对排序
 * @Author wanys
 * @Date 2022/9/5 09:36
 * @Version 1.0
 **/
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //找出arr1的最大值，定义数组大小
        int upper=0;
        for(int x:arr1){
            upper =Math.max(x,upper);
        }
        int[] frequency=new int[upper+1];
        //计数
        for(int x:arr1){
            frequency[x]++;
        }
        int[] ans=new int[arr1.length];
        int index=0;
        for(int x:arr2){
            //计数frequency[x]次
            for (int i = 0; i < frequency[x]; ++i) {
                ans[index++] = x;
            }
            frequency[x] = 0;
        }
        //处理arr1中剩余的元素，缀在后边,不知道剩余元素，全部遍历
        for(int x=0;x<=upper;x++){
            //利用了frequency[x]已经清零的条件，未清零的就是剩余元素
            for (int i = 0; i < frequency[x]; ++i) {
                ans[index++] = x;
            }
        }
        return ans;
    }
}
