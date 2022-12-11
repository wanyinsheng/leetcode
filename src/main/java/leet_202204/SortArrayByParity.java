package leet_202204;

/**
 * @Author wanys
 * @Date 2022/4/28 9:00 AM
 * @Version 1.0
 **/
public class SortArrayByParity {

    /**
     * 双指针
     * @param nums
     * @return
     */
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int left=0;
        int right=n-1;
        for (int i = 0; i <n ; i++) {
            if(nums[i]%2==0){
                res[left++]=nums[i];
            }else {
                res[right--]=nums[i];
            }

        }
        return res;
    }
}
