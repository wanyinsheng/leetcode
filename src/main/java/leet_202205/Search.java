package leet_202205;

/**
 * 704. 二分查找
 * @Author wanys
 * @Date 2022/5/20 2:00 PM
 * @Version 1.0
 **/
public class Search {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length==0)
            return -1;
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(left<=right){
             mid=(left+right)/2;
             if(target==nums[mid]){
                 return mid;
             }else if(target<nums[mid]){
                 right=mid-1;
             }else{
                 left=mid+1;
             }
        }
        return -1;
    }

}
