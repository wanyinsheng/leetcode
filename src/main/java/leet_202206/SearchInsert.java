package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/7 10:36 AM
 * @Version 1.0
 **/
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int ans=n;//插入位置
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target<=nums[mid]){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
}
