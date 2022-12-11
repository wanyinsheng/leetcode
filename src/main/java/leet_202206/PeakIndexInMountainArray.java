package leet_202206;

/**
 * 剑指 Offer II 069. 山峰数组的顶部
 * @Author wanys
 * @Date 2022/6/7 9:14 AM
 * @Version 1.0
 **/
public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int left=0;
        int right=n-2;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;

    }
}
