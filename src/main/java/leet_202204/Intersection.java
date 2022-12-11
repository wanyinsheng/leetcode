package leet_202204;

import java.util.Arrays;

/**
 * @Author wanys
 * @Date 2022/4/24 11:21 AM
 * @Version 1.0
 **/
public class Intersection {

    /**
     * 这里使用排序之后，再去使用双指针遍历
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1=nums1.length;
        int len2=nums2.length;
        int[] res=new int[Math.min(len1,len2)];//交集吗，取最小长度就行，因为有重复数子，最后还要截取
        //三个偏移量
        int index1=0;
        int index2=0;
        int index=0;
        while(index1<len1&&index2<len2){//交集都要在数组范围内
            int num1=nums1[index1];
            int num2=nums2[index2];
            if(num1==num2){
                //并不是相等就要加入，这里还要考虑交集的唯一性
                if(index==0||num1!=res[index-1]){//因为已经对数组排序了，所以只要和前一个比较即可，不相同才行
                    res[index++]=num1;
                }
                index1++;
                index2++;
            }else if(num1<num2){
                index1++;
            }else {
                index2++;
            }

        }
        //截取index个长度
        return Arrays.copyOfRange(res, 0, index);
    }
}
