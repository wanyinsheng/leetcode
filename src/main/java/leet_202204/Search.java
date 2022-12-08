package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/23 12:13 AM
 * @Version 1.0
 **/
public class Search {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        //没找到直接返回-1
        return -1;
    }
}
