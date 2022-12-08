package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/28 10:36 AM
 * @Version 1.0
 **/
public class SortArray {
    int[] temp;



    public int[] sortArray(int[] nums) {
        temp=new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return ;
        }
        //找中间值
        int mid = (l + r) >> 1;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);

    }
}
