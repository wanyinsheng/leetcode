package leet_202205;

/**
 * 面试题 17.04. 消失的数字
 * 方法   哈希表、数学求总和、位运算
 * @Author wanys
 * @Date 2022/5/21 10:08 AM
 * @Version 1.0
 **/
public class MissingNumber {

    /**
     *位运算 （异或运算）
     * x⊕x=0 和 x⊕0=x。
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int xor=0;
        int len=nums.length;
        for(int num:nums){
            xor^=num;
        }
        //在配合异或的结合律和交换律，自饭律等等性质，其实相同的数字异或之后就变成了0，最终是0和缺失数字的异或
        for (int i = 0; i <=len ; i++) {
            xor^=i;
        }
        return xor;

    }
}
