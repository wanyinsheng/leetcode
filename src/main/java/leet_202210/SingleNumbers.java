package leet_202210;

/**
 * @Author wanys
 * @Date 2022/10/16 09:19
 * @Version 1.0
 **/
public class SingleNumbers {
    public int[] singleNumbers(int[] nums) {
        int res=0;
        for(int n:nums){
            res^=n;
        }
        //按照最后一为1进行分组
        int div=1;
        while ((div & res) == 0) {
            div <<= 1;
        }
        int a = 0, b = 0;
        //在每个分组内进行异或操作
        for (int n : nums) {
            if ((div & n) != 0) {
                a ^= n;
            } else {
                b ^= n;
            }
        }
        return new int[]{a,b};


    }
}
