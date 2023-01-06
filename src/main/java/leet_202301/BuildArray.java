package leet_202301;

/**
 * 1920. 基于排列构建数组
 * @Author wanys
 * @Date 2023/1/6 22:03
 * @Version 1.0
 **/
public class BuildArray {
    public int[] buildArray(int[] nums) {
        int[] ans=new int[nums.length];
        if(nums.length==0 )
            return ans;
        for (int i = 0; i <nums.length ; i++) {
            ans[i]=nums[nums[i]];

        }
        return ans;
    }
}
