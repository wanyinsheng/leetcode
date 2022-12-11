package leet_202205;

/**
 * @Author wanys
 * @Date 2022/5/20 8:52 PM
 * @Version 1.0
 **/
public class GetConcatenation {

    public int[] getConcatenation(int[] nums) {


        int n = nums.length*2;
        int[] ans=new int[n];
        for (int i = 0; i <nums.length; i++) {
          ans[i]=nums[i];
          ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
