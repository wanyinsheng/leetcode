package leet_202206;

/**
 * @Author wanys
 * @Date 2022/6/12 9:30 PM
 * @Version 1.0
 **/
public class MinMaxGame {
    public int minMaxGame(int[] nums) {
        
        int n = nums.length;
        while (n != 1) {
            int cnt = 0;
            for (int i = 0; i < n;) {
                if (cnt % 2 == 0) {
                    nums[cnt] = Math.min(nums[i], nums[i + 1]);
                } else {
                    nums[cnt] = Math.max(nums[i], nums[i + 1]);
                }
                i += 2;
                cnt++;
            }
            //每一次循环之后都要更新长度
            n = cnt;
        }
        return nums[0];

    }

}
