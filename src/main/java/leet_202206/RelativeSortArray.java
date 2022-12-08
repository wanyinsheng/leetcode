package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/30 3:56 PM
 * @Version 1.0
 **/
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index=0;
        int[] cnt=new int[1001];
        for(int x:arr1){
            cnt[x]++;
        }
        for (int x:arr2){
            while(cnt[x]-->0){
                arr1[index++]=x;
            }
        }
        for (int i = 0; i <cnt.length ; i++) {
            while (cnt[i]-- > 0) {
                arr1[index++] = i;
            }
        }
        return arr1;
    }
}
