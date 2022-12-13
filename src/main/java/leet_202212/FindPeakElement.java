package leet_202212;

/**
 * @Author wanys
 * @Date 2022/12/11 22:35
 * @Version 1.0
 **/
public class FindPeakElement {
    /**
     * 二分法
     * @param nums
     * @return
     */
    public int findPeakElement(int[] nums) {
        int left=-1;
        int right=nums.length-1;
        while(left+1<right){
            int mid=(left+right)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid;
            }else{
                right=mid;
            }

        }
        return right;
    }
}
